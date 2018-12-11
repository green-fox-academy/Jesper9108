package com.bankofsimba.bank.controllers;

import com.bankofsimba.bank.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List<BankAccount> accountList = new ArrayList<>();

    @PostConstruct
    public void addingToAccountList() {
        accountList.add(new BankAccount("Simba", 2000, "lion"));
        accountList.add(new BankAccount("Mufasa", 15000, "lion"));
        accountList.add(new BankAccount("Timon", 100, "littleasd"));
    }

    @GetMapping("/show")
    public String mainPage(Model model) {
        model.addAttribute("account", accountList);
        return "show";
    }

    

}
