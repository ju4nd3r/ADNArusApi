package com.ceiba.adnarus.web.controller;

import com.ceiba.adnarus.domain.User;
import com.ceiba.adnarus.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    UserService userService;


    @GetMapping
    public String saludar(){
        return "Holaaa";
    }

    @PostMapping
    public User save(User user){
        return userService.save(user);
    }

}
