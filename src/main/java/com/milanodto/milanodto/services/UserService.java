package com.milanodto.milanodto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.milanodto.milanodto.dto.UserDTO;
import com.milanodto.milanodto.entities.User;
import com.milanodto.milanodto.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }

}
