package com.example.Twitter.Service;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import com.example.Twitter.Repository.PostRepository;
import com.example.Twitter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    @Autowired PostRepository postRepository;

    public List<Post> getAllPosts(){

        return postRepository.findAll();


    }




    public Post addPost(Post post) {

        return postRepository.save(post);

    }
}
