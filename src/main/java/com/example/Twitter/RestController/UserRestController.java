package com.example.Twitter.RestController;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import com.example.Twitter.Service.PostService;
import com.example.Twitter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired UserService userService;



    @GetMapping("/users/")
    public List<User> getAllUsers(){


        return userService.getAllUsers();

    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable ("id") long id){


        return userService.getUserById(id);

    }

    @PostMapping("/users/")
    public User addUser (@RequestBody User user){

        return userService.addUser(user);

    }

    @PutMapping("/users/addpost/{userId}")
    public User createPost(@RequestBody Post post, @PathVariable ("userId") long id){


        return userService.createPost(post,id);

    }




}
