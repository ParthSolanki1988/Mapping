package com.simform.onetoonemapping.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity       //JPA dependency
@Table(name = "student")
public class Student {

  @Id
  @Column(name = "student_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "student_name")
    String name;

  @OneToOne(cascade = CascadeType.ALL , mappedBy = "student")
  Passport passport;


  public void addPassport(Passport passport) {
    passport.setStudent(this);
  }



}
