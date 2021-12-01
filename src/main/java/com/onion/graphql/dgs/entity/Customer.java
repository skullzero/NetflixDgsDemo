package com.onion.graphql.dgs.entity;

public class Customer {
    private final String id;
    private final String name;
    private final Account account;

    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
