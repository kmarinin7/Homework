package Homework6_1;

public class Therapist extends Doctor {

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Терапевт " + name + " проводит осмотр и назначает лечение");
    }

    public void assignDoctor(Patient patient) {
        int plan = patient.getTreatmentPlan();

        if (plan == 1) {
            Surgeon surgeon = new Surgeon("Доктор Чейз");
            patient.setDoctor(surgeon);
            surgeon.heal();
        } else if (plan == 2) {
            Dantist dantist = new Dantist("Доктор Кэмерон");
            patient.setDoctor(dantist);
            dantist.heal();
        } else {
            patient.setDoctor(this);
            this.heal();
        }
    }
}
