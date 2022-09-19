package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
