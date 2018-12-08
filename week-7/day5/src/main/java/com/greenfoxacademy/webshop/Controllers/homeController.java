package com.greenfoxacademy.webshop.Controllers;

import com.greenfoxacademy.webshop.Shopitem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class homeController {

    List<Shopitem> itemList = new ArrayList<>();

    @PostConstruct
    public void init() {
        itemList.add(new Shopitem("Running shoes", "Nike for the run", 1500, 5));
        itemList.add(new Shopitem("Snapback hat", "Fixed size hat", 400, 150));
        itemList.add(new Shopitem("Elephant", "Big mammal", 25000, 10));
        itemList.add(new Shopitem("DarkElf", "Evil creatures, difficult to handle", 50, 0));
        itemList.add(new Shopitem("Plant", "Green as forest", 100, 100));
        itemList.add(new Shopitem("Snapback hat", "Nike hat", 12, 185));
        itemList.add(new Shopitem("Starship", "Game for everyone", 150000, 2));
        itemList.add(new Shopitem("Window", "Two layer glass with wooden rims", 55, 6));
        itemList.add(new Shopitem("Cameleon", "Lizard, only 6 colors included", 230, 11));
        itemList.add(new Shopitem("Ketchup", "For all food", 2, 300));
    }

    @GetMapping("/home")
    public String getHomeView(Model model) {
        model.addAttribute("items", itemList);
        return "home";
    }

    @GetMapping("/onlyavailable")
    public String sortZeroStock(Model model) {
        model.addAttribute("items", itemList.stream()
                .filter(shopitem -> shopitem.getQuantity() > 0)
                .collect(Collectors.toList()));
        return "home";
    }

    @GetMapping("/priceascend")
    public String sortPriceAscend(Model model) {
        model.addAttribute("items", itemList.stream()
                .sorted(Comparator.comparing(Shopitem::getPrice))
                .collect(Collectors.toList()));
        return "home";
    }

    @GetMapping("/containsnike")
    public String containsNike(Model model) {
        model.addAttribute("items", itemList.stream()
                .filter(shopitem -> shopitem.getName().toLowerCase().contains("nike") || shopitem.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList()));
        return "home";
    }

    @GetMapping("/averagestock")
    public String avgstock(Model model) {
        model.addAttribute("avg", itemList.stream()
                .filter(shopitem -> shopitem.getQuantity() > 0)
                .mapToDouble(Shopitem::getQuantity)
                .average().orElse(0.0));
        return "mod";
    }

    @GetMapping("/mostexpensive")
    public String mostexp(Model model) {
        List<Shopitem> max = new ArrayList<>();
        max.add(itemList.stream()
                .max(Comparator.comparingInt(Shopitem::getPrice)).get());
        model.addAttribute("items", max);
        return "home";
    }

    @PostMapping("/search")
    public String search(@RequestParam("searching") String item, Model model) {
        model.addAttribute("items", itemList.stream()
                .filter(shopitem -> shopitem.getName().toLowerCase().contains(item) || shopitem.getDescription().toLowerCase().contains(item))
                .collect(Collectors.toList())
        );
        return "home";
    }

}
