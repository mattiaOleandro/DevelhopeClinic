package develhopeclinic.services;

import develhopeclinic.entities.Doctor;
import develhopeclinic.repositories.I_DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public  Doctor getDoctorById (int id){
        return  repository.findById(id).orElse(null);
    }

    public Doctor getDoctorByName (String name){
        return repository.findByName(name);
    }

    public String deleteDoctor (int id){
        repository.deleteById(id);
        return "Doctor Removed! " + id;
    }

    public Doctor updateDoctor (Doctor doctor){
        Doctor existingDoctor= repository.findById(doctor.getId()).orElse(null);
        existingDoctor.setName(doctor.getName());
        existingDoctor.setSurname(doctor.getSurname());
        existingDoctor.setBirthDate(doctor.getBirthDate());
        return repository.save(existingDoctor);
    }
}
