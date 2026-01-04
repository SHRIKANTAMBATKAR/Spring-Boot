package com.shrikant.employeecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrikant.employeecrud.dao.EmployeeDao;
import com.shrikant.employeecrud.entity.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeDao.findById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDao.deleteById(id);
    }
}
