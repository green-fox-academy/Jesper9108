package com.example.dependencies.Controller;

import com.example.dependencies.Services.BlueColor;
import com.example.dependencies.Services.MyColor;
import com.example.dependencies.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HomeController {

    private Printer printer;
    private MyColor color1;

    @Autowired
    public HomeController(Printer printer, MyColor color1) {
        this.printer = printer;
        this.color1 = color1;
    }

    @ResponseBody()
    @GetMapping("/print")
    public String home() {
        return printer.log("hello");
    }

    @ResponseBody()
    @GetMapping("/color")
    public String color(){
        return (printer.log(color1.printColor()));
    }

}
