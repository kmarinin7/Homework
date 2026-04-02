package Homework6_1;

public class Dantist extends Doctor {

    public Dantist(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Стоматолог " + name + " сверлит, пилит, разрезает в общем делает пациенту больно");
    }
}