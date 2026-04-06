package Homework5;

public class Bancomat {

    int count20;
    int count50;
    int count100;


    public Bancomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // Добавления денег в банкомат
    public void addMoney(int count20, int count50, int count100) {
        this.count20 = this.count20 + count20;
        this.count50 = this.count50 + count50;
        this.count100 = this.count100 + count100;

        System.out.println("Банкомат пополнен:");
        System.out.println("  Добавлено купюр по 20: " + count20);
        System.out.println("  Добавлено купюр по 50: " + count50);
        System.out.println("  Добавлено купюр по 100: " + count100);
    }

    // Снятия денег
    public boolean withdraw(int amount) {
        System.out.println("\nЗапрошена сумма: " + amount + " руб.");


        int original20 = count20;
        int original50 = count50;
        int original100 = count100;

        int need100 = 0;
        int need50 = 0;
        int need20 = 0;


        need100 = amount / 100;
        if (need100 > count100) {
            need100 = count100;
        }
        int remaining = amount - (need100 * 100);


        need50 = remaining / 50;
        if (need50 > count50) {
            need50 = count50;
        }
        remaining = remaining - (need50 * 50);


        need20 = remaining / 20;


        if (need20 <= count20 && remaining % 20 == 0) {
            count100 = count100 - need100;
            count50 = count50 - need50;
            count20 = count20 - need20;


            System.out.println("Операция выполнена. Выдано:");
            if (need100 > 0) {
                System.out.println("  " + need100 + " x 100 руб.");
            }
            if (need50 > 0) {
                System.out.println("  " + need50 + " x 50 руб.");
            }
            if (need20 > 0) {
                System.out.println("  " + need20 + " x 20 руб.");
            }

            return true;
        } else {
            System.out.println("Ошибка: Невозможно выдать запрошенную сумму.");
            return false;
        }
    }
}

