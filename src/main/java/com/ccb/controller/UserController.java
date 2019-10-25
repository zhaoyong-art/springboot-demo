package com.ccb.controller;

import com.ccb.pojo.User;
import com.ccb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Void> insert(User user) {
        userService.insert(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping
    public ResponseEntity<Void> updateUserById(User user) {
        userService.updateUserById(user);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity<User> selectUserById(@RequestParam("id") Long id) {
        return ResponseEntity.ok(userService.selectUserById(id));

    }

}
