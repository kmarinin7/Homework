package Homework8;
import java.util.Scanner;

/*
Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */


public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append(c).append(c);
        }

        String output = result.toString();

        System.out.println("Результат: " + output);

        scanner.close();
    }
}