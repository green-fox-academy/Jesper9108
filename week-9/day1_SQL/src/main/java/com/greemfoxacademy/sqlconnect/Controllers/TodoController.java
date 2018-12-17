package com.greemfoxacademy.sqlconnect.Controllers;

import com.greemfoxacademy.sqlconnect.Models.Todo;
import com.greemfoxacademy.sqlconnect.Models.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/add")
    public String addTodo(Model model, @ModelAttribute("todo") Todo todo){
        model.addAttribute("todo", todo);
        return "add";
    }

    @PostMapping("/add")
    public String saveNewTodo(@ModelAttribute("todo") Todo todo){
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable long id){
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editTodo(Model model, @PathVariable long id){
        Optional<Todo> todo = todoRepository.findById(id);
        model.addAttribute("todoEdit", todo.get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String saveEditedTodo(@ModelAttribute("todoEdit") Todo todo){
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }


}
