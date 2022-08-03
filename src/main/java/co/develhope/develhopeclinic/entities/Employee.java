package co.develhope.develhopeclinic.entities;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class Employee extends Person {

    private Enum role;
    private String login;
    private String password;
    private String badgeNumber;
    private Enum placeOfWork;

    public Employee() {
    }

    public Employee(int id, String name, String surname, String address, String city, String phone,
                    String email, EnumGender gender, int age, String nationality, String placeOfBirth,
                    LocalDate birthDate, String fiscalCode, String documentNumber, String medicRole,
                    Enum role, String login, String password, String badgeNumber, Enum placeOfWork) {

        super(id, name, surname, address, city, phone, email,
                gender, age, nationality, placeOfBirth, birthDate,
                fiscalCode, documentNumber, medicRole);
        this.role = role;
        this.login = login;
        this.password = password;
        this.badgeNumber = badgeNumber;
        this.placeOfWork = placeOfWork;
    }

    public Enum getRole() {
        return role;
    }

    public void setRole(Enum role) {
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

    public Enum getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(Enum placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
