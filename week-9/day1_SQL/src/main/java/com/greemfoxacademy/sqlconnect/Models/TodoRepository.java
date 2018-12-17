package com.greemfoxacademy.sqlconnect.Models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByDone(Boolean done);
}