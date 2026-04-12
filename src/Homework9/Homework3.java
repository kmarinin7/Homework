package Homework9;
import java.util.*;

/*
Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

public class Homework3 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();

        for (String s : strings) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }

        Map<String, Boolean> result = new HashMap<>();
        for (String s : count.keySet()) {
            if (count.get(s) >= 2) {
                result.put(s, true);
            } else {
                result.put(s, false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println("Вход: " + Arrays.toString(test1));
        System.out.println("Результат: " + wordMultiple(test1));

        String[] test2 = {"c", "b", "a"};
        System.out.println("Вход: " + Arrays.toString(test2));
        System.out.println("Результат: " + wordMultiple(test2));

        String[] test3 = {"c", "c", "c", "c"};
        System.out.println("Вход: " + Arrays.toString(test3));
        System.out.println("Результат: " + wordMultiple(test3));
    }
}
