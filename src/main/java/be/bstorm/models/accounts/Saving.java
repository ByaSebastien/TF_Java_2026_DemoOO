package be.bstorm.models.accounts;

import be.bstorm.models.Person;

import java.time.LocalDateTime;

public class Saving extends Account {

    private LocalDateTime lastWithdraw;
    private LocalDateTime lastDeposit;

    public Saving() {}

    public Saving(String number, Person holder) {
        super(number, holder);
    }

    public LocalDateTime getLastWithdraw() {
        return lastWithdraw;
    }

    public LocalDateTime getLastDeposit() {
        return lastDeposit;
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        lastDeposit = LocalDateTime.now();
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount);
        lastWithdraw = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return super.toString() + "Saving{" +
                "lastWithdraw=" + lastWithdraw +
                ", lastDeposit=" + lastDeposit +
                '}';
    }


}
