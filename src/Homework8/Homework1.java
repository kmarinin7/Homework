package Homework8;
import java.util.Scanner;

/*
Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String s3 = scanner.nextLine();

        String shortest = s1;
        String longest = s1;

        if (s2.length() < shortest.length()) {
            shortest = s2;
        }
        if (s2.length() > longest.length()) {
            longest = s2;
        }

        if (s3.length() < shortest.length()) {
            shortest = s3;
        }
        if (s3.length() > longest.length()) {
            longest = s3;
        }

        System.out.println("Самая короткая: " + shortest + ", ее длина = " + shortest.length());
        System.out.println("Самая длинная: " + longest + ", ее длина = " + longest.length());

        scanner.close();
    }
}
