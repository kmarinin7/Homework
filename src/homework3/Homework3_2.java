package homework3;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива (просто целое число)");

        int size = scanner.nextInt();

        int[] values = new int[size];

        System.out.println("Выберите способ заполнения массива:");
        System.out.println("1 - автоматически (Random)");
        System.out.println("2 - вручную");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < values.length; i++) {
                values[i] = random.nextInt(101);
            }
            System.out.println(Arrays.toString(values));
        } else if (choice == 2) {
            for (int i = 0; i < values.length; i++) {
                values[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(values));
        }
        int min = values[0];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);
    }
}