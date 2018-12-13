package com.example.dependencies.Controller;

import com.example.dependencies.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/useful")
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @ResponseBody
    @GetMapping("/email")
    public String validateMail(@RequestParam(name = "email") String emailaddress) {
//        model.addAttribute("state", utilityService.validateEmail(emailaddress));
//        model.addAttribute("emailaddress", emailaddress);
        return utilityService.validateEmail(emailaddress);
    }
}
