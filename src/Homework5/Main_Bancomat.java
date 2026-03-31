package Homework5;

public class Main_Bancomat {
    public static void main(String[] args) {
        System.out.println("######### ТЕСТИРОВАНИЕ БАНКОМАТА #########\n");

        // Создаем банкомат
        System.out.println("--- СОЗДАНИЕ БАНКОМАТА ---");
        Bancomat myBancomat = new Bancomat(10, 5, 3);

        // Пробуем снять
        System.out.println("\n--- ПОПЫТКА СНЯТИЯ 270 руб. ---");
        myBancomat.withdraw(270);

        System.out.println("\n--- ПОПЫТКА СНЯТИЯ 100 руб. ---");
        myBancomat.withdraw(100);

        System.out.println("\n--- ПОПЫТКА СНЯТИЯ 30 руб. ---");
        myBancomat.withdraw(30);

        // Добавляем деньги
        System.out.println("\n--- ПОПОЛНЕНИЕ БАНКОМАТА ---");
        myBancomat.addMoney(5, 2, 1);

        // Снова пробуем снять
        System.out.println("\n--- ПОПЫТКА СНЯТИЯ 200 руб. ПОСЛЕ ПОПОЛНЕНИЯ ---");
        myBancomat.withdraw(200);
    }
}