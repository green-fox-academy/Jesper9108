package com.bankofsimba.bank;

public class BankAccount {
    private static int nextID = 0;

    private int id;
    private String name;
    private long balance;
    private String animalType;

    public BankAccount(String name, long balance, String animalType) {
        this.id = nextID++;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public int getId() {
        return id;
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
