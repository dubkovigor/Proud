package com.solution.service;

import com.solution.dto.UserDto;
import com.solution.entity.Rep;

import java.util.Collection;

public interface UserService {

    UserDto saveUser(UserDto userDto);

    Collection<Rep> getGit();
}
