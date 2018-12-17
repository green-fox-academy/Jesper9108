package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Models.Todo;
import com.greenfoxacademy.demo.Models.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {


    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
        todoRepository.save(new Todo("shopping", true, false));
        todoRepository.save(new Todo("workout", true, true));
        todoRepository.save(new Todo("workout", true, true));
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
