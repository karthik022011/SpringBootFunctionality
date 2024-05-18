package com.kartheek.user.service;


import com.kartheek.user.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<String> saveUser(User user);
}
