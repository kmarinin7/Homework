package Homework8;
import java.util.Scanner;

/*
Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */


public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово:");
        String w1 = scanner.nextLine();

        System.out.println("Введите второе слово:");
        String w2 = scanner.nextLine();

        System.out.println("Введите третье слово:");
        String w3 = scanner.nextLine();

        String found = null;

        if (hasUniqueChars(w1)) {
            found = w1;
        } else if (hasUniqueChars(w2)) {
            found = w2;
        } else if (hasUniqueChars(w3)) {
            found = w3;
        }

        if (found != null) {
            System.out.println("Найдено слово: " + found);
        } else {
            System.out.println("Нет слов из разных символов");
        }

        scanner.close();
    }

    public static boolean hasUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}