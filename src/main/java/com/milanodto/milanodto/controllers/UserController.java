package com.milanodto.milanodto.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.milanodto.milanodto.dto.UserDTO;
import com.milanodto.milanodto.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value="/{id}")
    public UserDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
