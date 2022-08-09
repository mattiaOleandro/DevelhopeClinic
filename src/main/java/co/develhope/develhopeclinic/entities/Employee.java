package co.develhope.develhopeclinic.entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class Employee extends Person {

    @Enumerated(EnumType.STRING)
    private EnumRole role;
    private String login;
    private String password;
    private String badgeNumber;
    @Enumerated(EnumType.STRING)
    private EnumPlaceOfWork placeOfWork;

    public Employee() {
    }

    public Employee(EnumRole role, String login, String password, String badgeNumber, EnumPlaceOfWork placeOfWork) {
        this.role = role;
        this.login = login;
        this.password = password;
        this.badgeNumber = badgeNumber;
        this.placeOfWork = placeOfWork;
    }

    public Employee(int id, String name, String surname, String address, String city, String phone, String email, EnumGender gender, String nationality, String placeOfBirth, LocalDate birthDate, String fiscalCode, String documentNumber, EnumRole role, String login, String password, String badgeNumber, EnumPlaceOfWork placeOfWork) {
        super(id, name, surname, address, city, phone, email, gender, nationality, placeOfBirth, birthDate, fiscalCode, documentNumber);
        this.role = role;
        this.login = login;
        this.password = password;
        this.badgeNumber = badgeNumber;
        this.placeOfWork = placeOfWork;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public EnumPlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(EnumPlaceOfWork placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
