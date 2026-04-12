package Homework9;
import java.util.*;

/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую");
        String input = scanner.nextLine();

        String[] numbers = input.split(",\\s*");

        Set<String> unique = new LinkedHashSet<>();
        for (String num : numbers) {
            unique.add(num);
        }

        String result = String.join(", ", unique);
        System.out.println("Результат без дубликатов: " + result);
    }
}
