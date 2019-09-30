package com.solution.dto.transformers;

import com.solution.dto.UserDto;
import com.solution.entity.User;

public class UserDtoToUser {

    private UserDtoToUser() {
    }

    public static User transform(UserDto userDto) {

        User user = new User();

        return user;
    }
}
