package com.example.Twitter.Service;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import com.example.Twitter.Repository.PostRepository;
import com.example.Twitter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired PostRepository postRepository;

    @Autowired UserRepository userRepository;



    public List<Post> getAllPosts(){

        return postRepository.findAll();


    }


    public Post addPost(Post post) {

        return postRepository.save(post);


    }


    public List<Post> getPostsByUserName(long userId) {

        User userFromDatabase = userRepository.findById(userId).orElseThrow();

        return userFromDatabase.getUserPosts();


    }

    public Post giveLike(long postId) {

       Post postFromDatabase = postRepository.findById(postId).orElseThrow();

       int likes = postFromDatabase.getLikes();

       int giveLike = likes + 1;

       postFromDatabase.setLikes(giveLike);

       return postRepository.save(postFromDatabase);


    }
}
