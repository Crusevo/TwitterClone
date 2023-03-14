package com.example.Twitter.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @NonNull
    private String title;

    @NonNull
    private String postContent;

    private int likes =0;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;



}
