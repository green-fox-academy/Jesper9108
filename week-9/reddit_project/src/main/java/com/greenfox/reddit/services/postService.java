package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class postService {

    private postRepository postRepository;

    @Autowired
    public postService(com.greenfox.reddit.repositories.postRepository postRepository) {
        this.postRepository = postRepository;
        postRepository.save(new Post("cook1", "cooking is good", 100));
        postRepository.save(new Post("cook", "cooking is good", 90));
        postRepository.save(new Post("party", "today I will have a good party", 80));
        postRepository.save(new Post("party", "today I will have a good party", 70));
        postRepository.save(new Post("party", "today I will have a good party", 60));
        postRepository.save(new Post("cook", "cooking is good", 50));
        postRepository.save(new Post("cook", "cooking is good", 40));
        postRepository.save(new Post("party", "today I will have a good party", 30));
        postRepository.save(new Post("party", "today I will have a good party", 20));
        postRepository.save(new Post("party", "today I will have a good party", 10));
        postRepository.save(new Post("cook2", "cooking is good", 92));
        postRepository.save(new Post("cook", "cooking is good", 93));
        postRepository.save(new Post("party", "today I will have a good party", 77));
        postRepository.save(new Post("party", "today I will have a good party", 21));
        postRepository.save(new Post("party", "today I will have a good party", 22));
        postRepository.save(new Post("cook", "cooking is good", 11));
        postRepository.save(new Post("cook", "cooking is good", 16));
        postRepository.save(new Post("party", "today I will have a good party", 92));
    }

    public Page<Post> findAllPaged(int page) {
        return postRepository.findAll(new PageRequest(page, 10, Sort.by("score").descending()));
    }

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public void incrementPostScore(long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() + 1);
            postRepository.save(post);
        }
    }

    public void decrementPostScore(long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() - 1);
            postRepository.save(post);
        }
    }
}
