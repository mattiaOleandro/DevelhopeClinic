package co.develhope.develhopeclinic.services;


import co.develhope.develhopeclinic.entities.Patient;
import co.develhope.develhopeclinic.repositories.I_PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private I_PatientRepository repository;

    public Patient savePatient (Patient patient){
        return repository.save(patient);
    }

    public List<Patient> savePatients (List<Patient> patients){
        return repository.saveAll(patients);
    }

    public  List<Patient> getPatients (){
        return  repository.findAll();
    }

    public  Patient getPatientById (int id){
        return  repository.findById(id);
    }

    public String deletePatient (int id){
        repository.deleteById(id);
        return "Patient Removed! " + id;
    }

    public Patient updatePatient (Patient patient) throws NullPointerException{
        Patient existingPatient = repository.findById(patient.getId());
        try {
            existingPatient.setName(patient.getName());
            existingPatient.setSurname(patient.getSurname());
            existingPatient.setNationality(patient.getNationality());
            existingPatient.setPlaceOfBirth(patient.getPlaceOfBirth());
            existingPatient.setBirthDate(patient.getBirthDate());
            existingPatient.setFiscalCode(patient.getFiscalCode());
            existingPatient.setDocumentNumber(patient.getDocumentNumber());
            existingPatient.setAddress(patient.getAddress());
            existingPatient.setCity(patient.getCity());
            existingPatient.setPhone(patient.getPhone());
            existingPatient.setEmail(patient.getEmail());
            existingPatient.setMedicalPatology(patient.getMedicalPatology());
            existingPatient.setGender(patient.getGender());


        }catch (NullPointerException e){
            e.printStackTrace();
        }return repository.save(existingPatient);
    }
}
