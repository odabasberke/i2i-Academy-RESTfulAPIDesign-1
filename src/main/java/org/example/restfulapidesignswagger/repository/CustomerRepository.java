package org.example.restfulapidesignswagger.repository;

import org.example.restfulapidesignswagger.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}