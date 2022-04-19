package com.learn.project.Bootcamp.Project.repository;

import com.learn.project.Bootcamp.Project.entities.Users.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Integer> {

//    @Query("select id,concat(firstName,' ',COALESCE(middleName,''),' ',lastName) as FullName,email,isActive,companyName,companyContact from seller")// where isActive=true")
//    List<Object[]> findAllSeller();

    List<Seller> findAll();
}
