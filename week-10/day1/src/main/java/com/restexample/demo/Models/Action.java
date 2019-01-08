package com.restexample.demo.Models;

public class Action {

    private int until;

    public Action(int until) {
        this.until = until;
    }

    public Action() {
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }

    public int sumUntil(int numParam) {
        int sumTotal = 0;
        for (int i = 1; i < numParam + 1; i++) {
            sumTotal += i;
        }
        return sumTotal;
    }

    public int factorUntil(int numParam) {
        int factorTotal = 1;
        for (int i = 1; i < numParam + 1; i++) {
            factorTotal *= i;
        }
        if (numParam == 0) {
            return 0;
        }
        return factorTotal;
    }
}
