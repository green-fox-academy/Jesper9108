package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam("name") String name) {
        Greeting greet = new Greeting(1, name);

        return greet;
    }
}
