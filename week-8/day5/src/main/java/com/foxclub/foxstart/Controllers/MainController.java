package com.foxclub.foxstart.Controllers;

import com.foxclub.foxstart.Models.Fox;
import com.foxclub.foxstart.Models.FoxCollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class MainController {

    FoxCollect foxCollect;

    @Autowired
    public MainController(FoxCollect foxCollect) {
        this.foxCollect = foxCollect;
        foxCollect.addFox("SampleFox");
    }

    @GetMapping("login")
    public String index(Model model) {
        model.addAttribute("fox", foxCollect.foxList);
        return "login";
    }

//    @GetMapping("Trickcenter")
//    public String tricks(Model model) {
//        model.addAttribute("tricklist", foxList.get(0).trickCreator());
//        return "Trickcenter";
//    }
}
