package com.example.demo.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.user;


@Repository
public interface userRepository extends JpaRepository<user,Long> {

	
	Optional<user> findByLogin(String login);
	
}
