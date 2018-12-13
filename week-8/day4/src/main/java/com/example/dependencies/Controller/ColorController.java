package com.example.dependencies.Controller;

import com.example.dependencies.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utility")
public class ColorController {

    private UtilityService utilityService;

    @Autowired
    public ColorController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/colored")
    public String coloredBackground(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }
}
