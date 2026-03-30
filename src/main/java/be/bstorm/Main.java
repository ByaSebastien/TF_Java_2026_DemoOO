package be.bstorm;

import be.bstorm.models.Bank;
import be.bstorm.models.accounts.Account;
import be.bstorm.models.accounts.Current;
import be.bstorm.models.Person;
import be.bstorm.models.accounts.Saving;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person joe = new Person("Joe", "Dalton", LocalDate.of(1990, 1, 1));
        Current joeCurrent = new Current("123",1000, joe);
        Saving joeSaving = new Saving("12345", joe);
        Bank thiefs = new Bank("Bad thiefs");
        thiefs.addAccount(joeSaving);

        thiefs.addAccount(joeCurrent);

        System.out.println("Il est né le divine enfant " + thiefs.getAccount("123").getHolder().getFirstName() + " " + thiefs.getAccount("123").getHolder().getLastName());

        System.out.println(joeCurrent);

        joeCurrent.deposit(10000);

        System.out.println(joeCurrent);

        joeCurrent.withdraw(10500);

        System.out.println(joeCurrent);

        joeCurrent.withdraw(10500);

        System.out.println(joeCurrent);

        System.out.println(joeSaving);

        joeSaving.deposit(10000);

        System.out.println(joeSaving);

        joeSaving.withdraw(10500);

        System.out.println(joeSaving);

        joeSaving.withdraw(10500);

        System.out.println(joeSaving);

        // Polymorphisme

        Account current = new Current();
        Account saving = new Saving();
        Object account = new Account();

        if(current instanceof Current c) {
            c.setCreditLine(54011040);
        }

    }
}