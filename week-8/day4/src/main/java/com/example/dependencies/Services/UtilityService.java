package com.example.dependencies.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;

    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {
        String message;
        if (email.contains("@") && email.contains(".")) {
            message = email + " is a valid address";
        } else {
            message = email + " is not a valid address";
        }
        return message;
    }
}
