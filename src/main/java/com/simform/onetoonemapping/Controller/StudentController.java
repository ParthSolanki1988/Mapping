package com.simform.onetoonemapping.Controller;


import com.simform.onetoonemapping.Entity.Student;
import com.simform.onetoonemapping.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/students")
public class StudentController {

  @Autowired
  private StudentService studentService;

  // build create User REST API

  //  CREAT
  @PostMapping
  public void createStudents(@RequestBody Student student){


      log.info("Create User");
      Student saveStudent = studentService.createStudentWithPassport(student);
  }


}
