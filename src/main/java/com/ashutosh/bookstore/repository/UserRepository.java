package com.ashutosh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashutosh.bookstore.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
