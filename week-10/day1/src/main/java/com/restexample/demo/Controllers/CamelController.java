package com.restexample.demo.Controllers;

import com.restexample.demo.Models.Camelizer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {

    @PostMapping("translate")
    public Object camelization(@RequestBody Camelizer camelizer){
        camelizer.setText(camelizer.camelLangTransform(camelizer.getText()));
        camelizer.setLang("teve");

        return camelizer;
    }
}
