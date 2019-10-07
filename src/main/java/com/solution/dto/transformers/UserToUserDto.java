package com.solution.dto.transformers;

import com.solution.dto.UserDto;
import com.solution.entity.User;

public class UserToUserDto {

    private UserToUserDto() {
    }

    public static UserDto transform(User user) {

        UserDto userDto = new UserDto();

        return userDto;
    }
}
