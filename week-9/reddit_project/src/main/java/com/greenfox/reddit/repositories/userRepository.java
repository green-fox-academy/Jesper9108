package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface userRepository extends JpaRepository<User, Long> {
}
