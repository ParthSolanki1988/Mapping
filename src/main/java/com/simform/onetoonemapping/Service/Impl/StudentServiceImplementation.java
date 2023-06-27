package com.simform.onetoonemapping.Service.Impl;

import com.simform.onetoonemapping.Entity.Passport;
import com.simform.onetoonemapping.Entity.Student;
import com.simform.onetoonemapping.Repository.PassportRepository;
import com.simform.onetoonemapping.Repository.StudentRepository;
import com.simform.onetoonemapping.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class StudentServiceImplementation implements StudentService {

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  PassportRepository passportRepository;

//  @Override
//  public Student createStudent(Student student) {
//    return studentRepository.save(student);
//
//  }
//
//  @Override
//  public List<Student> getAllStudents() {
//
//    if(studentRepository.count() == 0){
//      log.error("Student Not Found");
//    }
//    else {
//      log.info("Student list is Available");
//    }
//
//
//    return studentRepository.findAll();
//
//  }

//  @Override
//  public Student updateStudent(Student student) {
//    Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
//    if (student.getId() == 0 ){
//      student.setId(existingStudent.getId());
//
//    }
//    if (student.getName() == "" || student.getName() == null){
//      student.setName(existingStudent.getName());
//
//    }
//    existingStudent.setId(student.getId());
//    existingStudent.setName(student.getName());
//
//
//    return studentRepository.save(existingStudent);
//
//  }

//  @Override
//  public String deleteStudent(long id) {
//    if (!studentRepository.existsById(id)){
//      return "Student Id Not found";
//    }
//    else {
//      studentRepository.deleteById(id);
//      return "Student Removed with ID : " + id;
//    }
//
//  }

  @Override
  public Student createStudentWithPassport(Student student) {
    Passport passport = student.getPassport();
    passport.setStudent(student);
    passportRepository.save(passport);
    return student;
  }
}
