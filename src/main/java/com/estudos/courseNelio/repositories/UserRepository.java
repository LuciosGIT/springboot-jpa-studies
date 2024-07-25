package com.estudos.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.courseNelio.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
