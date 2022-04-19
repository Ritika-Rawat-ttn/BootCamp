package com.learn.project.Bootcamp.Project.services;

import com.learn.project.Bootcamp.Project.entities.Users.Role.Role;
import com.learn.project.Bootcamp.Project.enums.ERole;
import com.learn.project.Bootcamp.Project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RoleService {


        @Autowired
        RoleRepository roleRepository;

        public void saveRole(ERole role){
            Role role1= roleRepository.findByName(role.toString());
            if(role1==null){
                Role role2=new Role();
                role2.setName(role.toString());
                roleRepository.save(role2);
            }
        }
    }

