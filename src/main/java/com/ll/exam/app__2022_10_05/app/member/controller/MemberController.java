package com.ll.exam.app__2022_10_05.app.member.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @PostMapping("/login")
    public String login(String username, String password) {
        return "username : %s, password : %s".formatted(username,password);
    }
}
