package com.onion.graphql.dgs.entity;

public class Account {
    private final String accountNo;
    private final String type;
    private final int balance;

    public Account(String accountNo, String type,int balance) {
        this.accountNo = accountNo;
        this.type = type;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getType() {
        return type;
    }

    public int getBalance() {
        return balance;
    }
}
