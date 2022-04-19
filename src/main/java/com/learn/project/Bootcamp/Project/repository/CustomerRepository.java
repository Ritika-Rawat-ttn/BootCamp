package com.learn.project.Bootcamp.Project.repository;

import com.learn.project.Bootcamp.Project.entities.Users.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("select id,concat(firstName,' ',COALESCE(middleName,''),' ',lastName) as FullName,email,isActive from Customer")// where isActive=true")
    List<Object[]> findAllCustomer();


    List<Customer> findAll();
//
//    @Query("select * from Customer")
//    List<Customer> findByCustomer();
//
//    @Query("select city ,state ,zipcode ,label ,country from from customer")
//    List<Customer> findAddress();

}