package com.example.JPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JPA.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
