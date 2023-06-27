package com.simform.manytomanymapping.Controller;

import com.simform.manytomanymapping.entity.Employee;
import com.simform.manytomanymapping.entity.Project;
import com.simform.manytomanymapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @PostMapping
  public Employee createEmployeeWithProject(@RequestBody Employee employee) {
    Employee employee1 = new Employee();
    employee1.setEmpName(employee.getEmpName());
    employee.getProjects().forEach(project -> project.addEmployee(employee1));
    return employeeService.createEmployee(employee);
  }

  @GetMapping
  public List<Employee> getAllEmployee(){
    return  employeeService.findAllEmployee();
  }
}
