package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User getUserById(Integer id);
    void create(User user);
    void update(User user);
    void deleteUserById(Integer id);
    User findByUsername(String username);
    List<User> findAllWithRoles();
}
