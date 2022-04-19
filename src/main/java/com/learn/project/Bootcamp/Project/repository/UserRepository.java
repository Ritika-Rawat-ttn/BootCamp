package com.learn.project.Bootcamp.Project.repository;

import com.learn.project.Bootcamp.Project.entities.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmail(String email);


}
