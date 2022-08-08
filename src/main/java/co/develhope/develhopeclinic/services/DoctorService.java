package co.develhope.develhopeclinic.services;

import co.develhope.develhopeclinic.entities.Doctor;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private I_DoctorRepository repository;

    public Doctor saveDoctor (Doctor doctor){
        return repository.save(doctor);
    }

    public List<Doctor> saveDoctors (List<Doctor> doctors){
        return repository.saveAll(doctors);
    }

    public  List<Doctor> getDoctors (){
        return  repository.findAll();
    }

    public Doctor getDoctorById (int id){
        return  repository.findById(id).orElse(null);
    }

    public Doctor getDoctorByName (String name){
        return repository.findByName(name);
    }

    //get Doctor by Fiscal Code
    public Doctor getDoctorByFiscalCode (String fiscal_code){
        return repository.findByfiscalCode(fiscal_code);
    }

    public String deleteDoctor (int id){
        repository.deleteById(id);
        return "Doctor n° " + id + " has been removed!";
    }

    public Doctor updateDoctor (Doctor doctor) throws NullPointerException{
        Doctor existingDoctor = repository.findById(doctor.getId()).orElse(null);
        try {
            existingDoctor.setName(doctor.getName());
            existingDoctor.setSurname(doctor.getSurname());
            existingDoctor.setBirthDate(doctor.getBirthDate());

        }catch (NullPointerException e){
            e.printStackTrace();
        }return repository.save(existingDoctor);
    }
}
