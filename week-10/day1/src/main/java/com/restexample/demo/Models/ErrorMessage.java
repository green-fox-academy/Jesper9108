package com.restexample.demo.Models;

import org.springframework.stereotype.Service;

@Service
public class ErrorMessage {

    private String error;

    public ErrorMessage(String error) {
        this.error = error;
    }

    public ErrorMessage() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
