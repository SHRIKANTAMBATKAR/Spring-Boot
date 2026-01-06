package com.shrikant.employeecrud.service;

import java.util.*;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrikant.employeecrud.dao.EmployeeDao;
import com.shrikant.employeecrud.dto.EmployeeDTO;
import com.shrikant.employeecrud.entity.Employee;
import com.shrikant.employeecrud.exception.EmployeeNotFoundException;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDTO saveEmployee(EmployeeDTO dto) {
        Employee employee = modelMapper.map(dto, Employee.class);
        Employee saved = employeeDao.save(employee);
        return modelMapper.map(saved, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeDao.findAll()
                .stream()
                .map(emp -> modelMapper.map(emp, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO updateEmployee(EmployeeDTO dto) {
        if (!employeeDao.existsById(dto.getId())) {
            throw new RuntimeException("Employee not found with id: " + dto.getId());
        }
        Employee employee = modelMapper.map(dto, Employee.class);
        return modelMapper.map(employeeDao.save(employee), EmployeeDTO.class);
    }

    public void deleteEmployee(Long id) {
        if (!employeeDao.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        employeeDao.deleteById(id);
    }
}
