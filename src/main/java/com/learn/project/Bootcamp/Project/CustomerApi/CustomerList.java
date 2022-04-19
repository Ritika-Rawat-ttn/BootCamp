//package com.learn.project.Bootcamp.Project.CustomerApi;
//
//import com.learn.project.Bootcamp.Project.entities.Users.Customer;
//import com.learn.project.Bootcamp.Project.repository.CustomerRepository;
//import com.learn.project.Bootcamp.Project.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//public class CustomerList  {
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//
//    @GetMapping("/userData")
//    public List<Customer> getUser() {
//        System.out.println("Show all user data");
//        return customerRepository.findByCustomer();
//
//    }
//
//
//
//
//
//}
