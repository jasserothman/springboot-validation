package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}