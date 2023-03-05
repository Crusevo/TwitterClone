package com.example.Twitter.Repository;

import com.example.Twitter.Model.Post;
import com.example.Twitter.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {




}
