package com.example.dependencies.Services;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        return "It is BLUE color...";
    }
}
