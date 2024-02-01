package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    User getUserById(Integer id);

    void createUser(User user);

    void updateUser(User user);


    void deleteUserById(Integer id);

    User findByUsername(String username);

    List<User> findAllWithRoles();

    User findByIdWithRoles(Integer userId);
}
