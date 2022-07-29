package develhopeclinic.controllers;

import develhopeclinic.entities.Doctor;
import develhopeclinic.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;

    @PostMapping("/addDoctor")
    public Doctor addDoctor (@RequestBody Doctor doctor){
        return service.saveDoctor(doctor);
    }

    @PostMapping ("/addDoctors")
    public List<Doctor> addDoctors (@RequestBody List<Doctor> doctors){
        return service.saveDoctors(doctors);
    }

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctors (){
        return service.getDoctors();
    }

    @GetMapping("/doctor/{id}")
    public Doctor findDoctorById (@PathVariable int id){
        return service.getDoctorById(id);
    }

    @GetMapping("/doctor/{name}")
    public Doctor findDoctorByName (@PathVariable String name){
        return service.getDoctorByName(name);
    }

    @PutMapping("/update")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return service.updateDoctor(doctor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id){
        return service.deleteDoctor(id);
    }
}

