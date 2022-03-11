package com.telusko.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.telusko.demo.model.Customers;







@RepositoryRestResource(collectionResourceRel="Customers", path ="Customers" )
public interface CustomersRepo extends JpaRepository<Customers, Integer>{
	

}