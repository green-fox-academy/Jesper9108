package com.example.dependencies.Services;

import org.springframework.stereotype.Service;

public class GreenColor implements MyColor {

    @Override
    public String printColor() {
        return "It is GREEN color...";
    }
}
