package com.kartheek.user.service;


import com.kartheek.user.entity.User;
import com.kartheek.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<String> saveUser(User user) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        return new ResponseEntity<>("Verify email by the link sent on your email address", HttpStatus.OK);
    }

}
