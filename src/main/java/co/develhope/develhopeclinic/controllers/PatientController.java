package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Patient;
import co.develhope.develhopeclinic.repositories.I_PatientRepository;
import co.develhope.develhopeclinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @Autowired
    private I_PatientRepository patientRepository;

    @PostMapping("/addSingle")
    public Patient addPatient (@RequestBody Patient patient){
        return service.savePatient(patient);
    }

    @PostMapping ("/addMulti")
    public List<Patient> addPatients (@RequestBody List<Patient> patients){
        return service.savePatients(patients);
    }

    @GetMapping("/allPatients")
    public List<Patient> findAllPatients (){
        return service.getPatients();
    }

    @GetMapping("/{id}")
    public Patient findPatientById (@PathVariable int id){
        return service.getPatientById(id);
    }

    @PutMapping("/update/{id}")
    public Patient updatePatient(@PathVariable int id, @RequestBody Patient patient){
        patient.setId(id);
        return patientRepository.saveAndFlush(patient);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id){
        return service.deletePatient(id);
    }
}
