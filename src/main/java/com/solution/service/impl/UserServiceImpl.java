package com.solution.service.impl;

import com.solution.dto.UserDto;
import com.solution.dto.transformers.UserDtoToUser;
import com.solution.dto.transformers.UserToUserDto;
import com.solution.entity.Rep;
import com.solution.entity.User;
import com.solution.repository.UserRepository;
import com.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = UserDtoToUser.transform(userDto);

        return UserToUserDto.transform(userRepository.save(user));
    }

    @Override
    public Collection<Rep> getGit() {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject("https://api.github.com/users/dubkovigor/repos", Rep[].class));
    }
}
