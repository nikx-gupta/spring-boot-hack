package org.hackspring.springsecurity.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/admin")
    public String get() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @GetMapping("/user")
    public String getUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();

    }
}
