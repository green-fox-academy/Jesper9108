package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.postService;
import com.greenfox.reddit.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private userService userService;
    private postService postService;

    @Autowired
    public HomeController(com.greenfox.reddit.services.userService userService, com.greenfox.reddit.services.postService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("posts", postService.findAllPaged(page));
        model.addAttribute("page", page);
        return "index";
    }

    @GetMapping("{id}/scoreup")
    public String upscore(@PathVariable long id, @RequestParam String page) {
        postService.incrementPostScore(id);
        return "redirect:/?page="+page;
    }

    @GetMapping("{id}/scoredown")
    public String downscore(@PathVariable long id, @RequestParam String page) {
        postService.decrementPostScore(id);
        return "redirect:/?page="+page;
    }

//    @GetMapping("/addpost")
//    public String createPost(Model model, @ModelAttribute("newpost") Post post) {
//        model.addAttribute("newpost", post);
//        return "addpost";
//    }

    @GetMapping("/addpost")
    public String createPost(){
        return "addpost";
    }

    @PostMapping("/addpost")
    public String savePost(@ModelAttribute("newpost") Post post) {
        postService.savePost(post);
        return "redirect:/";
    }

}
