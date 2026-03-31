package Homework5;

public class CreditCard {
    int accountNumber;
    int balance;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // начисление
    public void deposit(int amount) {
        balance = balance + amount;
    }

    // снятие
    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("На счету недостаточно средств");
        } else {
            balance = balance - amount;
        }
    }
    // текущая информация
    public void info() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + balance);
    }
}

