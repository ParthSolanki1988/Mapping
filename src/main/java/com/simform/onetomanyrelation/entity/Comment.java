package com.simform.onetomanyrelation.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comment")
public class Comment {
  @Id
  @Column(name = "comment_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "comment_text")
  String text;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "post_fk_id" , referencedColumnName = "id")
  @JsonIgnore
  private Post post;
}
