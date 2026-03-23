package Homework3_2;

/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Задача 1:
Посчитать сумму четных элементов стоящих на главной диагонали.
 */

import java.util.Random;
import java.util.Scanner;

public class Homework3_2_1 {

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

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix [i][i] % 2 == 0) {
                sum += matrix[i][i];
            }
        }

        System.out.println(sum);
    }
}
