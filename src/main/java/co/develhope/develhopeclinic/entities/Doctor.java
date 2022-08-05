package co.develhope.develhopeclinic.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DOCTOR_TBL")
public class Doctor extends Employee {

    @Column(name = "medicalSpecialization")
    private EnumMedicalSpecializzation medicalSpecialization;

    public Doctor() {
    }

    public Doctor(EnumMedicalSpecializzation medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }

    public Doctor(EnumRole role, String login, String password, String badgeNumber, EnumPlaceOfWork placeOfWork, EnumMedicalSpecializzation medicalSpecialization) {
        super(role, login, password, badgeNumber, placeOfWork);
        this.medicalSpecialization = medicalSpecialization;
    }

    public Doctor(int id, String name, String surname, String address, String city, String phone, String email, EnumGender gender, String nationality, String placeOfBirth, LocalDate birthDate, String fiscalCode, String documentNumber, EnumRole role, String login, String password, String badgeNumber, EnumPlaceOfWork placeOfWork, EnumMedicalSpecializzation medicalSpecialization) {
        super(id, name, surname, address, city, phone, email, gender, nationality, placeOfBirth, birthDate, fiscalCode, documentNumber, role, login, password, badgeNumber, placeOfWork);
        this.medicalSpecialization = medicalSpecialization;
    }

    public EnumMedicalSpecializzation getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(EnumMedicalSpecializzation medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }
}
