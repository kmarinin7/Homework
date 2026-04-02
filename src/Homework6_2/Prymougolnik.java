package Homework6_2;

public class Prymougolnik extends Figura {
    private double width;
    private double height;

    public Prymougolnik(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
