package Homework9;
import java.util.*;

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */

class AnimalStorage {
    private LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("Добавлено: " + animal);
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            String removed = animals.removeLast();
            System.out.println("Удалено: " + removed);
        } else {
            System.out.println("Коллекция пуста");
        }
    }

    public void printAnimals() {
        System.out.println("Текущий список: " + animals);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        AnimalStorage storage = new AnimalStorage();

        storage.addAnimal("Кошка");
        storage.addAnimal("Собака");
        storage.addAnimal("Хомяк");
        storage.addAnimal("Крыса");
        storage.printAnimals();

        storage.removeAnimal();
        storage.printAnimals();

        storage.removeAnimal();
        storage.printAnimals();
    }
}
