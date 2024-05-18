package com.kartheek.user.controller;



import com.kartheek.user.entity.User;
import com.kartheek.user.model.UserReq;
import com.kartheek.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService registerService;

    @ResponseBody
    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody UserReq userReq){
        // creating user object
        User user = new User();
        user.setFullName(userReq.getFullName());
        user.setUserName(userReq.getUsername());
        user.setEmail(userReq.getEmail());
        user.setPassword(userReq.getPassword());
        return registerService.saveUser(user);
    }

}
