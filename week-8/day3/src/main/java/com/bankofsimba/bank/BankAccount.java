package com.bankofsimba.bank;

public class BankAccount {
    private static int nextID = 1;
    private String name;
    private long balance;
    private String animalType;

    public BankAccount(String name, long balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public BankAccount() {

    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
