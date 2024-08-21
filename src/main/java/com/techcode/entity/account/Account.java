package com.techcode.entity.account;


import jakarta.persistence.*;


@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Integer account_id;
    private String account_holder;
    private String address;
    private String available_balance;
    private String currency_code;
    private double available_credit;
    private int bank_id;

    public Integer getId() {
        return account_id;
    }

    public void setId(Integer account_id) {
        this.account_id = account_id;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvailable_balance() {
        return available_balance;
    }

    public void setAvailable_balance(String available_balance) {
        this.available_balance = available_balance;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public double getAvailable_credit() {
        return available_credit;
    }

    public void setAvailable_credit(double available_credit) {
        this.available_credit = available_credit;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }
}
