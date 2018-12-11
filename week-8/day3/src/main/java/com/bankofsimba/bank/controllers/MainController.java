package com.bankofsimba.bank.controllers;

import com.bankofsimba.bank.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        accountList.add(new BankAccount("Timon", 100, "meerkats"));
    }

    @GetMapping("/show")
    public String mainPage(Model model) {
        model.addAttribute("account", accountList);
        return "show";
    }

    @GetMapping("/create")
    public String addNewAccountForm(Model model){
        model.addAttribute("bankacc", new BankAccount());
        return "create";
    }

    @PostMapping("/create")
    public String addNewAccount(@ModelAttribute BankAccount bankAccount) {
        accountList.add(bankAccount);
        return "redirect:/show";
    }


}
