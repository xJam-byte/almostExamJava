package com.example.almostexam.controllers;


import com.example.almostexam.dto.UserDto;
import com.example.almostexam.repositories.UserRepository;
import com.example.almostexam.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {
    private UserService userService;
    private UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository= userRepository;
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/update")
    public String updateUser(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "updateUser";
    }
    @PostMapping("/delete")
    public String showDeleteUser(Model model){
        UserLoginDto user = new UserLoginDto();
        model.addAttribute("deluser", user);
        return "deleteUser";
    }



}
