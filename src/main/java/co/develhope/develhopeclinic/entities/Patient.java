package co.develhope.develhopeclinic.entities;

import java.time.LocalDate;

public class Patient extends Person{

    private String medicalPatology;


    public Patient(){}

    public Patient(int id, String name, String surname, String address, String city, String phone, String email, Enum gender, int age, String nationality, String placeOfBirth, LocalDate birthDate, String fiscalCode, String documentNumber, String medicRole, String medicalPatology) {
        super(id, name, surname, address, city, phone, email, gender, age, nationality, placeOfBirth, birthDate, fiscalCode, documentNumber, medicRole);
        this.medicalPatology = medicalPatology;
    }

    public String getMedicalPatology() {
        return medicalPatology;
    }

    public void setMedicalPatology(String medicalPatology) {
        this.medicalPatology = medicalPatology;
    }
}
