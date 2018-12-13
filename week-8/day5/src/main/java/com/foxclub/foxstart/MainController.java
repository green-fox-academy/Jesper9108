package com.foxclub.foxstart;

import com.foxclub.foxstart.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class MainController {

    List<Fox> foxList;

    @PostConstruct
    public void generateFoxes() {
        foxList.add(new Fox("Helaku"));
    }

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("fox", foxList);
        return "index";
    }

    @GetMapping("Trickcenter")
    public String tricks(Model model) {
        model.addAttribute("tricklist", foxList.get(0).trickCreator());
        return "Trickcenter";
    }
}
