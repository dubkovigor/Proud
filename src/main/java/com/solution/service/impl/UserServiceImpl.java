package com.solution.service.impl;

import com.solution.dto.UserDto;
import com.solution.dto.transformers.UserDtoToUser;
import com.solution.entity.User;
import com.solution.repository.UserRepository;
import com.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(UserDto userDto) {

        User user = UserDtoToUser.transform(userDto);

        userRepository.save(user);
    }
}
