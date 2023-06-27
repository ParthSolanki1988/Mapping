package com.simform.onetoonemapping.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity       //JPA dependency
@Table(name = "course")
public class Course {

  @Id
  @Column(name = "course_id")
  long id;
  @Column(name = "course_name")
  String name;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "st_fk_id" , referencedColumnName = "student_id")
  private Student student;


}
