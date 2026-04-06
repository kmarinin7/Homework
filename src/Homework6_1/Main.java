package Homework6_1;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist("Доктор Хаус");

        Patient patient1 = new Patient("Фореман", 1);
        Patient patient2 = new Patient("Кадди", 2);
        Patient patient3 = new Patient("Уилсон", 3);

        System.out.println("Пациент Фореман (код 1):");
        therapist.assignDoctor(patient1);

        System.out.println("\nПациент Кадди (код 2):");
        therapist.assignDoctor(patient2);

        System.out.println("\nПациент Уилсон (код 3):");
        therapist.assignDoctor(patient3);
    }
}