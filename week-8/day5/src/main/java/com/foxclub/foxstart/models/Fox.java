package com.foxclub.foxstart.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> trickToLearn;
    private List<String> trickLearned;
    private List<String> food;
    private List<String> drink;


    public Fox(String name) {
        this.name = name;
        trickToLearn = trickCreator();
        food = new ArrayList<>();
        drink = new ArrayList<>();
    }

    public List<String> trickCreator() {
        trickToLearn.add("Write HTML");
        trickToLearn.add("Code in Java");
        trickToLearn.add("Backflip");
        return trickToLearn;
    }
}
