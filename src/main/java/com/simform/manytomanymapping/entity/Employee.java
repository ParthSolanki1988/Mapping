package com.simform.manytomanymapping.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  Long empId;

  @Column(name = "emp_name")
  String empName;

  @ManyToMany(cascade = CascadeType.ALL , mappedBy = "employees" , fetch = FetchType.LAZY)
  @JsonBackReference
  List<Project> projects = new ArrayList<>();


  public void addProject(Project project) {
    this.projects.add(project);
    project.getEmployees().add(this);
  }
}
