package com.network72media.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.network72media.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
