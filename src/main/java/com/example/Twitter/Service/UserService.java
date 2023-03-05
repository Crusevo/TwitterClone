package com.example.Twitter.Service;

import com.example.Twitter.Model.User;
import com.example.Twitter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired UserRepository userRepository;

    public List<User> getAllUsers(){

        return userRepository.findAll();


    }




    public User addUser(User user) {

        return userRepository.save(user);

    }
}
