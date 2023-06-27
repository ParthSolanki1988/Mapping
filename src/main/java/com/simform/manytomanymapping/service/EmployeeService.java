package com.simform.manytomanymapping.service;

import com.simform.manytomanymapping.entity.Employee;
import com.simform.manytomanymapping.entity.Project;
import com.simform.manytomanymapping.repository.EmployeeRepository;
import com.simform.manytomanymapping.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  @Autowired
  ProjectRepository projectRepository;

  public Employee createEmployee(Employee employee){
    return employeeRepository.save(employee);
  }

  public List<Employee> findAllEmployee(){
    return employeeRepository.findAll();
  }


}
