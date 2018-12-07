package com.greenfoxacademy.webshop.Controllers;

import com.greenfoxacademy.webshop.Shopitem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {

    List<Shopitem> itemList = new ArrayList<>();

    @PostConstruct
    public void init() {
        itemList.add(new Shopitem("Running shoes", "Nike for the run", 1500, 5));
        itemList.add(new Shopitem("Snapback hat", "Fixed size hat", 400, 150));
        itemList.add(new Shopitem("Elephant", "Big mammal", 25000, 10));
        itemList.add(new Shopitem("DarkElf", "Evil creatures, difficult to handle", 50, 0));
        itemList.add(new Shopitem("Running shoes", "Nike for the run", 1500, 5));
        itemList.add(new Shopitem("Snapback hat", "Fixed size hat", 400, 150));
        itemList.add(new Shopitem("Elephant", "Big mammal", 25000, 10));
        itemList.add(new Shopitem("DarkElf", "Evil creatures, difficult to handle", 50, 6));
        itemList.add(new Shopitem("Snapback hat", "Fixed size hat", 400, 150));
        itemList.add(new Shopitem("Elephant", "Big mammal", 25000, 10));
        itemList.add(new Shopitem("DarkElf", "Evil creatures, difficult to handle", 50, 6));
    }

    @GetMapping("/home")
    public String getHomeView(Model model) {
        model.addAttribute("items", itemList);
        return "home";
    }

    @GetMapping("/onlyavailable")
    public String sortZeroStock(Model model){
        return "home";
    }


}
