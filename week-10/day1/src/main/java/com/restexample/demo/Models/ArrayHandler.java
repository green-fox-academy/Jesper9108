package com.restexample.demo.Models;

public class ArrayHandler {

    private String what;
    private int[] numbers;

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayHandler() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int sumArrayElements(int[] inputArray){
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

    public int multiplyArrayElements(int[] inputArray){
        int multiValue = 1;
        for (int i = 0; i < inputArray.length; i++) {
            multiValue *= inputArray[i];
        }
        return multiValue;
    }

    public int[] doubleArrayElements(int[] inputArray){
        int[] doubledArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            doubledArray[i] = inputArray[i] * 2;
        }
        return doubledArray;
    }


}
