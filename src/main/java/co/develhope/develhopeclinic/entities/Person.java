package co.develhope.develhopeclinic.entities;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personID")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "phone")
    private String phone;
    @Column(unique = true, name = "email", length = 30)
    private String email;
    @Enumerated(EnumType.ORDINAL)
    private EnumGender gender;
    @Column(name = "age")
    private int age;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "placeOfBirth")
    private String placeOfBirth;
    @Column(name = "birthDate")
    private LocalDate birthDate;
    @Column(unique = true, name = "fiscalCode",length = 16) //valutare omocodia
    private String fiscalCode;
    @Column(unique = true, name = "documentNumber")
    private String documentNumber;
    @Column(name = "medicRole")
    private String medicRole;

    public Person() {
    }

    public Person(int id, String name, String surname, String address, String city,
                  String phone, String email, EnumGender gender, int age, String nationality,
                  String placeOfBirth, LocalDate birthDate, String fiscalCode,
                  String documentNumber, String medicRole) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.birthDate = birthDate;
        this.fiscalCode = fiscalCode;
        this.documentNumber = documentNumber;
        this.medicRole = medicRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnumGender getGender() {
        return gender;
    }

    public void setGender(EnumGender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getMedicRole() {
        return medicRole;
    }

    public void setMedicRole(String medicRole) {
        this.medicRole = medicRole;
    }
}
