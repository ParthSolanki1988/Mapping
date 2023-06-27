package com.simform.onetomanyrelation.service;

import com.simform.onetomanyrelation.entity.Comment;
import com.simform.onetomanyrelation.entity.Post;
import com.simform.onetomanyrelation.repository.CommentRepository;
import com.simform.onetomanyrelation.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  @Autowired
  CommentRepository commentRepository;

//  public Post createPost(Post post){
//
//    return postRepository.save(post);
//  }

  public Post createPostWithMultipleComments(Post post){
    post.getComments().forEach(comment -> comment.setPost(post)); //set post into comment table
    return postRepository.save(post);
  }

  public List<Post> findAllPost(){
    return postRepository.findAll();
  }

}
