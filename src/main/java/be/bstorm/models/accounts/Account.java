package be.bstorm.models.accounts;

import be.bstorm.models.Person;

import java.util.Objects;

public class Account {

    private String number;
    private int balance;
    private Person holder;

    public Account() {
        this.balance = 0;
    }

    public Account(String number, Person holder) {
        this();
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public Person getHolder() {
        return holder;
    }

    public void deposit(int amount) {
        if(amount < 0) {
            System.out.println("Le montant doit être positif");
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        this.withdraw(amount, 0);
    }

    protected void withdraw(int amount, int creditLine) {
        if(amount < 0) {
            System.out.println("Le montant doit être positif");
            return;
        }
        if(balance - amount < - creditLine) {
            System.out.println("La fin de mois est compliquée");
            return;
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", holder=" + holder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
