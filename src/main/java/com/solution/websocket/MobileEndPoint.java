package com.solution.websocket;

import com.solution.websocket.decoder.MessageDecoder;
import com.solution.websocket.encoder.MessageEncoder;
import com.solution.websocket.message.Message;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(
        value = "/socket/{userId}",
        decoders = MessageDecoder.class,
        encoders = MessageEncoder.class)
public class MobileEndPoint {

    private static Set<MobileEndPoint> mobileEndPoints = new CopyOnWriteArraySet<>();
    private static HashMap<String, String> users = new HashMap<>();
    private Session session;

    private static void broadcast(Message message)
            throws IOException, EncodeException {

        mobileEndPoints.forEach(endpoint -> {
            synchronized (endpoint) {
                try {
                    endpoint.session.getBasicRemote().
                            sendObject(message);
                } catch (IOException | EncodeException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("userId") String userId) throws IOException, EncodeException {

        this.session = session;
        mobileEndPoints.add(this);
        users.put(session.getId(), userId);

        Message message = new Message();
        message.setFrom(userId);
        message.setContent("Connected!");
        broadcast(message);
    }

    @OnMessage
    public void onMessage(Session session, Message message)
            throws IOException, EncodeException {

        message.setFrom(users.get(session.getId()));
        broadcast(message);
    }

    @OnClose
    public void onClose(Session session) throws IOException, EncodeException {

        mobileEndPoints.remove(this);
        Message message = new Message();
        message.setFrom(users.get(session.getId()));
        message.setContent("Disconnected!");
        broadcast(message);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }
}