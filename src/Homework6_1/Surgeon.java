package Homework6_1;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Хирург " + name + " проводит операцию");
    }
}
