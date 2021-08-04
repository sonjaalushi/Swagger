package com.example.springswagger.controller;

import com.example.springswagger.model.User;
import com.example.springswagger.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "store user API")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/searchUser/{userId}")
    @ApiOperation(value = "Search user API")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + userId));

    }

    @PostMapping("/updateUser/{userId}")
    public String updateUser(@PathVariable Long userId, @RequestBody User user) {
       // model.addAttribute("user", user);
        return userService.saveUser(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public List<User> deleteUser(@PathVariable Long userId) {
        return userService.deleteUser(userId);
    }


}
