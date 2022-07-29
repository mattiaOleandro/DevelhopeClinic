package co.develhope.develhopeclinic.entities;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DOCTOR_TBL")
public class Doctor {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private int age;
    private LocalDate birthDate;
    private String medicRole;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getMedicRole() {
        return medicRole;
    }

    public void setMedicRole(String medicRole) {
        this.medicRole = medicRole;
    }
}
