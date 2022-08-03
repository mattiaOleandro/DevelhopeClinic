package co.develhope.develhopeclinic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "DOCTOR_TBL")
public class Doctor extends Employee {

    public Doctor() {
    }

    public Doctor(int id, String name, String surname, String address,
                  String city, String phone, String email, EnumGender gender,
                  int age, String nationality, String placeOfBirth,
                  LocalDate birthDate, String fiscalCode, String documentNumber,
                  String medicRole, Enum role, String login, String password,
                  String badgeNumber, Enum placeOfWork) {

        super(id, name, surname, address, city,
                phone, email, gender, age, nationality,
                placeOfBirth, birthDate, fiscalCode,
                documentNumber, medicRole, role, login,
                password, badgeNumber, placeOfWork);
    }
}
