package Homework6_1;

public class Doctor {
    protected String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void heal() {
        System.out.println(name + " осматривает");
    }
}