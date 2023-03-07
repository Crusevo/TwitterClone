package com.example.Twitter.RestController;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import com.example.Twitter.Service.PostService;
import com.example.Twitter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostRestController {

    @Autowired
    PostService postService;


    @GetMapping("/posts/")
    public List<Post> getAllPosts(){


        return postService.getAllPosts();

    }

    @PostMapping("/posts/")
    public Post addPost (@RequestBody Post post){

        return postService.addPost(post);

    }




}
