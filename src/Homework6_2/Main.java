package Homework6_2;

public class Main {
    public static void main(String[] args) {
        Figura[] figura = new Figura[5];

        figura[0] = new Prymougolnik(5, 3);
        figura[1] = new Krug(4);
        figura[2] = new Treygolnik(3, 4, 5);
        figura[3] = new Prymougolnik(2, 6);
        figura[4] = new Krug(2.5);

        double totalPerimeter = 0;
        double totalArea = 0;

        System.out.println("Характеристики фигур:");
        for (int i = 0; i < figura.length; i++) {
            double p = figura[i].getPerimeter();
            double a = figura[i].getArea();
            totalPerimeter += p;
            totalArea += a;

            String name = figura[i].getClass().getSimpleName();

            System.out.println((i + 1) + ". " + name + ": Периметр: " + p + ", Площадь: " + a);
        }

        System.out.println("\nСумма периметров всех фигур: " + totalPerimeter);
    }
}
