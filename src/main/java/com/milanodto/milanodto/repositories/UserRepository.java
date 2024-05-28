package com.milanodto.milanodto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milanodto.milanodto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    
}
