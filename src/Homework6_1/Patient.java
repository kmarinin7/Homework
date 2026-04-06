package Homework6_1;

public class Patient {
    private String name;
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
        System.out.println("Пациенту " + name + " назначен врач: " + doctor.getName());
    }
}
