package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private I_AppointmentRepository appointmentRepository;

    //add single appointment
    @PostMapping("/addSingle")
    public Appointment addAppointment (@RequestBody Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    //find all appointment
    @GetMapping("/findAllAppointment")
    public List<Appointment> findAllAppointment (){
        return appointmentRepository.findAll();
    }

    //find appointment by id
    @GetMapping("/findAppointmentById/{id}")
    public Optional<Appointment> findAppointmentById (@PathVariable int id){
        return appointmentRepository.findById(id);
    }

    //update appointment by id
    @PutMapping("/update/{id}")
    public Appointment updateAppointment(@PathVariable int id, @RequestBody Appointment appointment){
        appointment.setId(id);
        return appointmentRepository.saveAndFlush(appointment);
    }

    //delete appointment by id
    @DeleteMapping("/delete/{id}")
    public String deleteAppointment (@PathVariable int id){
        appointmentRepository.deleteById(id);
        return"Appointment n° " + id + " has been removed!";
    }
}
