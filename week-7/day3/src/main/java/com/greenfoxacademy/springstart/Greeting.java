package com.greenfoxacademy.springstart;

public class Greeting {

    public static long counter = 1;

    public long id;

    public String content;

    public Greeting( String content) {
        id = counter;
        counter++;
        this.content = "Hello " + content;
    }
}
