package com.simform.onetoonemapping.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity       //JPA dependency
@Table(name = "passport")
public class Passport {
  @Id
  @Column(name = "pass_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long passId;

  @Column(name = "pass_number")
  String passNumber;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "stu_fk_id" , referencedColumnName = "student_id")
  @JsonIgnore
  private Student student;



}
