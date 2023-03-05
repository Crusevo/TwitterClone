package com.example.Twitter.RestController;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import com.example.Twitter.Service.PostService;
import com.example.Twitter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostRestController {

    @Autowired
    PostService postService;


    @GetMapping("/users/")
    public List<Post> getAllPosts(){


        return postService.getAllPosts();

    }

    @PostMapping("/users/")
    public Post addPost (@RequestBody Post post){

        return postService.addPost(post);

    }




}
