package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import com.greenfox.reddit.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService{

    private userRepository userRepository;

    @Autowired
    public userService(com.greenfox.reddit.repositories.userRepository userRepository) {
        this.userRepository = userRepository;
        userRepository.save(new User("Kelemen", "Kelemen Kabátban"));
        userRepository.save(new User("Nintendo", "Lakatos Nintendo"));
    }

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }


}
