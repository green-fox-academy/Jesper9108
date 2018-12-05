package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWEBController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam("name") String name, Model model, Greeting greeting) {
        model.addAttribute("name", name);
        model.addAttribute("counter", greeting.getId());
        return "greeting";
    }
}
