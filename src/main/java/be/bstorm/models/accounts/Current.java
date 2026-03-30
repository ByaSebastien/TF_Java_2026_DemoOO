package be.bstorm.models.accounts;

import be.bstorm.models.Person;

public class Current extends Account {

    private int creditLine = 0;

    public Current() {
    }

    public Current(String number, Person holder) {
        super(number, holder);
    }

    public Current(String number, int creditLine, Person holder) {
        this(number, holder);
        this.setCreditLine(creditLine);
    }

    public int getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(int creditLine) {
        if(creditLine < 0) {
            System.out.println("La ligne de drédit doit être positive");
            return;
        }
        this.creditLine = creditLine;
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount, creditLine);
    }

    @Override
    public String toString() {
        return  super.toString() + "Current{" +
                "creditLine=" + creditLine +
                '}';
    }
}
