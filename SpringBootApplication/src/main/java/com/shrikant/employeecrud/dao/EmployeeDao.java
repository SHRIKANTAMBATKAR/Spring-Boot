package com.shrikant.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shrikant.employeecrud.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
}

