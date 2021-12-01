package com.onion.graphql.dgs.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.onion.graphql.dgs.entity.Account;
import com.onion.graphql.dgs.entity.Customer;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class CustomerFetcher {
    private final List<Customer> customers = List.of(
                new Customer("1", "Tom", new Account("123456", "deposit", 100)),
                new Customer("2", "Jerry", new Account("654321", "deposit", 150)),
                new Customer("3", "Micky", new Account("321654", "deposit", 200))
            );

    @DgsQuery
    public List<Customer> getCustomers(@InputArgument String id) {
        if(id == null) {
            return customers;
        }

        return customers.stream().filter(s -> s.getId().contains(id)).collect(Collectors.toList());
    }
}
