package co.develhope.develhopeclinic.entities;

import java.time.LocalDate;

public class Patient {


    private int patientId;
    private String name;
    private String surname;
    private String nationality;
    private String placeOfBirth;
    private LocalDate birthDate;
    private String fiscalCode;
    private String documentNumber;
    private String address;
    private String city;
    private String phone;
    private String email;
    //This datum as soon as it is implemented the Enum class will vary.
    private String gender;

    public Patient(){}

    public Patient(int patientId, String name, String surname, String nationality, String placeOfBirth, LocalDate birthDate, String fiscalCode, String documentNumber, String address, String city, String phone, String email, String gender){

        this.patientId = patientId;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.birthDate = birthDate;
        this.fiscalCode = fiscalCode;
        this.documentNumber = documentNumber;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
