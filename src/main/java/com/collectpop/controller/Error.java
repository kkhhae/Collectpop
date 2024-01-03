package com.collectpop.controller;

import com.collectpop.domain.Users;
import com.collectpop.security.CustomUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/error")
public class Error {

    @GetMapping("/")
    public String error(@AuthenticationPrincipal CustomUser user, Model mo){
        Users users = user.getUsers();
        mo.addAttribute("users", users);
        return "/error";
    }


}
