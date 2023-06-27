package com.simform.onetomanyrelation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "post")
public class Post {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "post_title")
  String title;

  @Column(name = "post_dis")
  String description;

  @OneToMany(cascade = CascadeType.ALL , mappedBy = "post")
  private List<Comment> comments = new ArrayList<>();

//  public void addComment(Comment comment) {
//    comment.setPost(this);
//    this.comments.add(comment);
//  }
}
