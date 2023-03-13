package com.example.Twitter.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String userName;

    @NonNull
    private String lastName;

    @NonNull
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;



}
