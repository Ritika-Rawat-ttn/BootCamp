package com.learn.project.Bootcamp.Project;

import com.learn.project.Bootcamp.Project.entities.Users.Address;
import com.learn.project.Bootcamp.Project.entities.Users.Customer;
import com.learn.project.Bootcamp.Project.entities.Users.Role.Role;
import com.learn.project.Bootcamp.Project.entities.Users.Seller;
import com.learn.project.Bootcamp.Project.entities.Users.User;
import com.learn.project.Bootcamp.Project.repository.CustomerRepository;
import com.learn.project.Bootcamp.Project.repository.RoleRepository;
import com.learn.project.Bootcamp.Project.repository.SellerRepository;
import com.learn.project.Bootcamp.Project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class BootcampProjectApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	SellerRepository sellerRepository;

//	@Autowired
//	PasswordEncoder passwordEncoder;

	@Test
	void contextLoads() {
	}

	@Test
	public void createCustomer(){
		Customer customer=new Customer();
		userRepository.save(customer);
		User user=new User();
		customer.setEmail("asdf@gmail.com");
		customer.setContact("981096197");
		Address address=new Address();
		customer.setFirstName("Ritika");
		customer.setLastName("Rawat");
		customer.setPassword("Ritika");
		Role role=roleRepository.findByName("ROLE_CUSTOMER");
		System.out.println(role.getName());
		Set<Role> roles=new HashSet<>();
		roles.add(role);
		user.setRoles(roles);
		customer.addRole(role);
		userRepository.save(customer);
		address.setCity("Delhi");
		address.setCountry("India");
		address.setLabel("home");
		address.setState("Delhi");
		address.setAddressLine("jwqj jwqj");
		address.setZipCode(110074);

		//user.addAddress(address);
		//userRepository.save(customer);
	}
	@Test
	public void createSeller(){
		Seller seller=new Seller();
		userRepository.save(seller);
		User user=new User();
		seller.setEmail("laxmi@gmail.com");
		seller.setCompanyContact(981096197);
		Address address=new Address();
		seller.setFirstName("Laxmi");
		seller.setLastName("Rawat");
		seller.setPassword("Ritika");
		Role role=roleRepository.findByName("ROLE_SELLER");
		System.out.println(role.getName());
		Set<Role> roles=new HashSet<>();
		roles.add(role);
		user.setRoles(roles);
		seller.addRole(role);
		userRepository.save(seller);
		address.setCity("Dddun");
		address.setCountry("India");
		address.setLabel("home");
		address.setState("uk");
		address.setAddressLine("jwqj assdfhj");
		address.setZipCode(246149);

		user.addAddress(address);
		userRepository.save(seller);
	}

	/*@Test
	public void getRoles(){
		List<Role> role=roleRepository.findAll();
		role.forEach(p -> System.out.println(p));

	}*/

	@Test
	public void testst(){
		Customer customer=new Customer();
		customer.setFirstName("Ritika");
		userRepository.save(customer);
		customer.setLastName("Rawat");
		userRepository.save(customer);
	}
	@Test
	public void testst1(){
		//Customer customer=new Customer();
		Seller seller=new Seller();

		seller.setFirstName("Ritika");
		userRepository.save(seller);
		seller.setLastName("Rawat");
		userRepository.save(seller);
	}


	@Test
	public void ewj(){
		List<Customer> customers=customerRepository.findAll();
		customers.forEach(p -> System.out.println(p.getId() + "--->" + p.getEmail()));


		List<Object[]> partialData =customerRepository.findAllCustomer();
		for (Object[] objects : partialData) {
			System.out.println("Id: "+objects[0]+" FullName: "+objects[1]+"Emial: "+objects[2]);
		}

	}
//	@Test
//	public void ewj1() {
//		List<Seller> sellerss = sellerRepository.findAll();
//		sellerss.forEach(p -> System.out.println(p.getId() + "--->" + p.getEmail()+p.getCompanyContact()+p.getCompanyName()+p.getAddresses()));
//	}

}
