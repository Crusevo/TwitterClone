package com.example.Twitter.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @NonNull
    private String title;

    @NonNull
    private String postContent;

    @ManyToOne
    private User postToUser;



}
