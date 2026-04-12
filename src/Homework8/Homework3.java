package Homework8;
import java.util.Scanner;

/*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String s3 = scanner.nextLine();

        int sum = s1.length() + s2.length() + s3.length();
        double average = sum / 3.0;

        System.out.println("Средняя длина: " + average);
        System.out.println("Строки длина которых меньше средней:");

        if (s1.length() < average) {
            System.out.println("\"" + s1 + "\" — длина " + s1.length());
        }
        if (s2.length() < average) {
            System.out.println("\"" + s2 + "\" — длина " + s2.length());
        }
        if (s3.length() < average) {
            System.out.println("\"" + s3 + "\" — длина " + s3.length());
        }

        scanner.close();
    }
}