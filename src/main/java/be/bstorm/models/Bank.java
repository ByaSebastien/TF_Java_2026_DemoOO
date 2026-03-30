package be.bstorm.models;

import be.bstorm.models.accounts.Account;
import be.bstorm.models.accounts.Current;

import java.util.HashMap;

public class Bank {

    private String name;
    private final HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public Bank(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Account getAccount(String accountNumber) {
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account number " + accountNumber + " not found");
            return null;
        }
        return accounts.get(accountNumber);
    }

    public void addAccount(Account account) {
        if(accounts.containsKey(account.getNumber())){
            System.out.println("Compte déja existant dans la banque " + this.getName());
            return;
        }
        accounts.put(account.getNumber(), account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account.getNumber());
    }

}
