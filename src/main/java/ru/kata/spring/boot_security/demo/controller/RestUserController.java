package ru.kata.spring.boot_security.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.entity.User;

@RestController
@RequestMapping("/user")
public class RestUserController {
    @GetMapping("/userList")
    public ResponseEntity<User> showAuthUser(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(user);
    }
}
