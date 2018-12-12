package com.bankofsimba.bank.controllers;

import com.bankofsimba.bank.BalanceMod;
import com.bankofsimba.bank.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List<BankAccount> accountList;
    BalanceMod balanceMod;


    @PostConstruct
    public void addingToAccountList() {
        accountList = new ArrayList<>();
        accountList.add(new BankAccount("Simba", 2000, "lion"));
        accountList.add(new BankAccount("Mufasa", 15000, "lion"));
        accountList.add(new BankAccount("Timon", 100, "meerkats"));

    }

    @GetMapping("/show")
    public String mainPage(Model model) {
        balanceMod = new BalanceMod();
        model.addAttribute("account", accountList);
        model.addAttribute("balancemod", new BalanceMod());
        return "show";
    }

    @PostMapping("/show")
    public String raiseBalance(@ModelAttribute("balancemod") BalanceMod balanceMod) {
        for (int i = 0; i < balanceMod.getCheckboxValues().size(); i++) {
            for (int j = 0; j < accountList.size(); j++) {
                if (balanceMod.getCheckboxValues().get(i).equals(accountList.get(j).getName())) {
                    accountList.get(j).setBalance(accountList.get(j).getBalance() + 10);
                }
            }
        }
        return "redirect:/show";
    }

    @GetMapping("/create")
    public String newAccountForm(Model model) {
        model.addAttribute("bankacc", new BankAccount());

        return "create";
    }

    @PostMapping("/create")
    public String addNewAccount(@ModelAttribute BankAccount bankAccount) {
        accountList.add(bankAccount);
        return "redirect:/show";
    }

}
