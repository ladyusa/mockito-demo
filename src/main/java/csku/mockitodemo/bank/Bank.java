package csku.mockitodemo.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String bankName;
    private Map<String, BankAccount> accounts;

    public Bank(String name) {
        this.bankName = name;
        this.accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getName(), account);
    }

    public void transfer(String from, String to, double amount) {
        accounts.get(from).withdraw(amount);
        accounts.get(to).deposit(amount);
    }
}
