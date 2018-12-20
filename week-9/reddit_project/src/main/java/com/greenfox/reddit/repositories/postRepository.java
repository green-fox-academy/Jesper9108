package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface postRepository extends JpaRepository<Post, Long> {

}
