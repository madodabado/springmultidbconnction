package com.techcode.service;

import com.techcode.entity.account.Account;
import com.techcode.entity.customer.Customer;
import com.techcode.repository.primary.PrimaryEntityRepository;
import com.techcode.repository.secondary.SecondaryEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MyService {

    private final PrimaryEntityRepository primaryEntityRepository;
    private final SecondaryEntityRepository secondaryEntityRepository;


    // Constructor Injection
    @Autowired
    public MyService(PrimaryEntityRepository primaryEntityRepository,
                     SecondaryEntityRepository secondaryEntityRepository) {
        this.primaryEntityRepository = primaryEntityRepository;
        this.secondaryEntityRepository = secondaryEntityRepository;
    }

    // Method to handle data in the customer database
    @Transactional("primaryTransactionManager")
    public Customer createPrimaryEntity(Customer customer) {
        return primaryEntityRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return primaryEntityRepository.findAll();
    }

    // Method to handle data in the account database
    @Transactional("secondaryTransactionManager")
    public Account createAccount(Account account) {
        return secondaryEntityRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return secondaryEntityRepository.findAll();
    }




}