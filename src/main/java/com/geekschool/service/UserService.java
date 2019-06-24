package com.geekschool.service;

import com.geekschool.constants.Status;
import com.geekschool.dto.UserDto;
import com.geekschool.constants.Role;
import com.geekschool.entity.User;

import java.util.List;

public interface UserService {

    UserDto save(User user);

    List<UserDto> getAllUser();

    User findByUsername(String name);

    UserDto findById(Long id);

    void updateRoleById(long id, Role role);

    void updateStatusById(long id, Status status);

    void delete(Long id);
}
