package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
