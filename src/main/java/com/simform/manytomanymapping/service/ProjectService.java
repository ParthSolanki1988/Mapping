package com.simform.manytomanymapping.service;

import com.simform.manytomanymapping.entity.Employee;
import com.simform.manytomanymapping.entity.Project;
import com.simform.manytomanymapping.repository.EmployeeRepository;
import com.simform.manytomanymapping.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProjectService {
  @Autowired
  ProjectRepository projectRepository;

  public List<Project> findAllProject(){
    return projectRepository.findAll();
  }

}
