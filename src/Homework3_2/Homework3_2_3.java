package Homework3_2;

/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Задача 3:
Проверить произведение элементов какой диагонали больше.
 */

import java.util.Random;
import java.util.Scanner;

public class Homework3_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер матрицы");

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(51);

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nНечетные элементы под главной диагональю (включительно):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 == 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}