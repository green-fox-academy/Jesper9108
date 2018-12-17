package com.greemfoxacademy.sqlconnect.Models;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}