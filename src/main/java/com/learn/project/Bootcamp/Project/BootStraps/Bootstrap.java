package com.learn.project.Bootcamp.Project.BootStraps;


import com.learn.project.Bootcamp.Project.enums.ERole;
import com.learn.project.Bootcamp.Project.repository.UserRepository;
import com.learn.project.Bootcamp.Project.services.RoleService;
import com.learn.project.Bootcamp.Project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

import static com.learn.project.Bootcamp.Project.enums.ERole.*;


@Component
public class Bootstrap implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
//    @Autowired
//    private SellerService sellerService;
//    @Autowired
//    private CustomerService customerService;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        roleService.saveRole(ROLE_ADMIN);
        roleService.saveRole(ROLE_CUSTOMER);
        roleService.saveRole(ROLE_SELLER);

      }
}
