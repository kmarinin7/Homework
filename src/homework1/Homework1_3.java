package homework1;

public class Homework1_3 {
    public static void main(String[] args) {
        int n = 345;
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        int d = a + b + c;
        System.out.println(d);
    }
}

