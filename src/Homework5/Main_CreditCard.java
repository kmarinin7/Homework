package Homework5;

public class Main_CreditCard {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(123456, 1000);
        CreditCard creditCard2 = new CreditCard(456098, 1000);
        CreditCard creditCard3 = new CreditCard(200321, 1000);


        System.out.println("---Начальный баланс и номер карты---");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();

        creditCard1.deposit(1500);
        creditCard2.deposit(2000);
        creditCard3.withdraw(500);

        System.out.println("\n---Текущий баланс и номер карты---");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
