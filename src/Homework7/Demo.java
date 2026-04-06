package Homework7;

public class Demo {

    // Метод 1: try-catch
    public void method1() {
        System.out.println("Метод 1");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: на ноль делить нельзя");
        }
    }

    // Метод 2: несколько catch
    public void method2() {
        System.out.println("Метод 2");
        String text = null;
        int[] arr = {1, 2};

        try {
            int length = text.length();
            int num = arr[5];
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка: переменная равна null");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: число находится за границей массива");
        }
    }

    public void method3() {
        System.out.println("Метод 3");
        int[] arr = {1, 2, 3};
        String text = null;

        try {
            int x = arr[10];
            int y = text.length();
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка: индекс или null");
        }
    }

    // Метод 4: try-catch-finally
    public void method4() {
        System.out.println("Метод 4");
        try {
            int a = 10 / 2;
        } catch (Exception e) {
            System.out.println("Ошибка");
        } finally {
            System.out.println("Математическая операция успешно выполнена");
        }
    }
}