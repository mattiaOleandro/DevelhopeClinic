package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Patient;
import co.develhope.develhopeclinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/addPatient")
    public Patient addPatient (@RequestBody Patient patient){
        return service.savePatient(patient);
    }

    @PostMapping ("/addPatients")
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

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient){
        return service.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id){
        return service.deletePatient(id);
    }
}
