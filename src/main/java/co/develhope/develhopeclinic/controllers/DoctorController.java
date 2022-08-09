package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Doctor;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
import co.develhope.develhopeclinic.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService service;

    @Autowired
    private I_DoctorRepository doctorRepository;

    @PostMapping("/addSingle")
    public Doctor addDoctor (@RequestBody Doctor doctor){
        return service.saveDoctor(doctor);
    }

    @PostMapping ("/addMulti")
    public List<Doctor> addDoctors (@RequestBody List<Doctor> doctors){
        return service.saveDoctors(doctors);
    }

    @GetMapping("/findAllDoctors")
    public List<Doctor> findAllDoctors (){
        return service.getDoctors();
    }

    @GetMapping("/findDoctorById/{id}")
    public Doctor findDoctorById (@PathVariable int id){
        return service.getDoctorById(id);
    }

    @GetMapping("/findDoctorByName/{name}")
    public Doctor findDoctorByName (@PathVariable String name){
        return service.getDoctorByName(name);
    }

    //get Doctor by Fiscal Code
    @GetMapping("/findDoctorByFiscalCode/{fiscal_code}")
    public Doctor findDoctorByFiscalCode (@PathVariable String fiscal_code){
        return service.getDoctorByFiscalCode(fiscal_code);
    }

    @PutMapping("/update/{id}")
    public Doctor updateDoctor(@PathVariable int id, @RequestBody Doctor doctor){
        doctor.setId(id);
        return doctorRepository.saveAndFlush(doctor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctor (@PathVariable int id){
        return service.deleteDoctor(id);
    }
}

