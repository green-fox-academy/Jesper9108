package com.restexample.demo.Models;

import org.springframework.stereotype.Service;

public class Doubled {

    private int singleNum;
    private int doubleNum;

    public Doubled(int singleNum, int doubleNum) {
        this.singleNum = singleNum;
        this.doubleNum = doubleNum;
    }

    public Doubled() {
    }

    public int getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(int singleNum) {
        this.singleNum = singleNum;
    }

    public int getDoubleNum() {
        return doubleNum;
    }

    public void setDoubleNum(int doubleNum) {
        this.doubleNum = doubleNum;
    }
}
