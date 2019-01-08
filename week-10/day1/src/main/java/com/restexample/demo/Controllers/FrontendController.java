package com.restexample.demo.Controllers;

import com.restexample.demo.Models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontendController {


    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) Integer input) {
        Doubled doubled = new Doubled();
        ErrorMessage doubleError = new ErrorMessage();
        if (input != null) {
            doubled.setSingleNum(input);
            doubled.setDoubleNum(input * 2);
            return doubled;
        }
        doubleError.setError("Please provide an input!");
        return doubleError;
    }

    @GetMapping("/greeter")
    public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        Greeter greeter = new Greeter();
        ErrorMessage greetError = new ErrorMessage();

        if (name == null && title == null) {
            greetError.setError("Please provide a name and a title!");
            return greetError;
        } else if (name == null) {
            greetError.setError("Please provide a name!");
            return greetError;
        } else if (title == null) {
            greetError.setError("Please provide a title!");
            return greetError;
        }
        greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
        return greeter;
    }

    @GetMapping("appenda/{appendable}")
    public Object appender(@PathVariable String appendable) {
        Append append = new Append();
        append.setAppended(appendable + "a");
        return append;
    }

    @GetMapping("dountil/{action}")
    public Object dountil(@PathVariable String action, @RequestParam(required = false) Integer number) {
        Action action1 = new Action();
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setError("Please provide a number!");

        if (number != null) {
            if (action.equals("sum")) {
                action1.setUntil(action1.sumUntil(number));
                return action1;
            } else if (action.equals("factor")) {
                action1.setUntil(action1.factorUntil(number));
                return action1;
            }
        }
        return errorMessage;
    }

}
