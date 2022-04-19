package com.learn.project.Bootcamp.Project.repository;

import com.learn.project.Bootcamp.Project.entities.token.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<ConfirmationToken,Long> {

    ConfirmationToken findByConfirmationToken(String confirmationToken);
}
