package com.simform.onetomanyrelation.Controller;

import com.simform.onetomanyrelation.entity.Post;
import com.simform.onetomanyrelation.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

  @Autowired
  PostService postService;


  @PostMapping
  public ResponseEntity<Post> savePost(@RequestBody Post post){
    post = postService.createPostWithMultipleComments(post);
    return new ResponseEntity<>(post , HttpStatus.CREATED);
  }

  @GetMapping("/post")
  public ResponseEntity<List<Post>> findAll(){
    List<Post> allPost = postService.findAllPost();
    return new ResponseEntity<>(allPost , HttpStatus.FOUND);
  }

}
