package com.restexample.demo.Controllers;

import com.restexample.demo.Models.ArrayHandler;
import com.restexample.demo.Models.ErrorMessage;
import com.restexample.demo.Models.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

    @PostMapping("arrays")
    public Object arrayModification(@RequestBody ArrayHandler arrayHandler){
        Result result = new Result();
        ErrorMessage errorMessage = new ErrorMessage();

        if(arrayHandler.getWhat().equals("sum")){
            result.setResult(arrayHandler.sumArrayElements(arrayHandler.getNumbers()));
            return result;
        } else if (arrayHandler.getWhat().equals("multiply")){
            result.setResult(arrayHandler.multiplyArrayElements(arrayHandler.getNumbers()));
            return result;
        } else if (arrayHandler.getWhat().equals("double")){
            result.setResult(arrayHandler.doubleArrayElements(arrayHandler.getNumbers()));
            return result;
        }
        errorMessage.setError("Please provide what to do with the numbers");
        return errorMessage;
    }
}
