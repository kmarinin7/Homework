package Homework8;
import java.util.Scanner;

/*
Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */


public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String s3 = scanner.nextLine();

        String temp;

        if (s1.length() > s2.length()) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        if (s2.length() > s3.length()) {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }

        if (s1.length() > s2.length()) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        System.out.println("Строки в порядке возрастания значений их длины:");
        System.out.println("1. \"" + s1 + "\" (длина " + s1.length() + ")");
        System.out.println("2. \"" + s2 + "\" (длина " + s2.length() + ")");
        System.out.println("3. \"" + s3 + "\" (длина " + s3.length() + ")");

        scanner.close();
    }
}