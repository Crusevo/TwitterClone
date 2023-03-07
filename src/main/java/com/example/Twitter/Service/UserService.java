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
public class UserService {


    @Autowired UserRepository userRepository;

    @Autowired PostRepository postRepository;



    public List<User> getAllUsers(){

        return userRepository.findAll();


    }

    public User getUserById(long id) {

        return userRepository.findById(id)
                .orElseThrow();

    }

    public User addUser(User user) {

        return userRepository.save(user);

    }

    public User createPost (Post post, long id){

       User userFromDataBase = userRepository.findById(id).orElseThrow();

       List<Post> userFromDataBasePosts = userFromDataBase.getUserPosts();

       postRepository.save(post);

       userFromDataBasePosts.add(post);

       return userRepository.save(userFromDataBase);


    }


}
