package co.develhope.develhopeclinic.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "patientTable")
public class Patient extends Person{

    private String medicalPatology;


    public Patient(){}

    public Patient(int id, String name, String surname, String address, String city, String phone, String email, EnumGender gender, int age, String nationality, String placeOfBirth, LocalDate birthDate, String fiscalCode, String documentNumber, String medicalPatology, String medicRole) {
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
