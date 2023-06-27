package com.simform.manytomanymapping.Controller;

import com.simform.manytomanymapping.entity.Employee;
import com.simform.manytomanymapping.entity.Project;
import com.simform.manytomanymapping.service.EmployeeService;
import com.simform.manytomanymapping.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

  @Autowired
  ProjectService projectService;


  @GetMapping
  public List<Project> getAllEmployee(){
    return  projectService.findAllProject();
  }
}
