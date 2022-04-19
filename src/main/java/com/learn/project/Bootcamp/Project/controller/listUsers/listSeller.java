package com.learn.project.Bootcamp.Project.controller.listUsers;

import com.learn.project.Bootcamp.Project.repository.SellerRepository;
import com.learn.project.Bootcamp.Project.services.AdminService;
import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Where(clause = "is_active=true")
@RestController
public class listSeller {

    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    AdminService adminService;

//
//    @GetMapping("/viewseller")
//    public List<Object[]> getSeller(){
//        System.out.println("hello Seller");
//        return sellerRepository.findAllSeller();
//
//    }
//
}
