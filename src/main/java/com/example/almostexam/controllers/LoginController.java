package com.example.almostexam.controllers;

import com.example.almostexam.dto.UserLoginDto;
import com.example.almostexam.entity.User;
import com.example.almostexam.repositories.UserRepository;
import com.example.almostexam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller

public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
