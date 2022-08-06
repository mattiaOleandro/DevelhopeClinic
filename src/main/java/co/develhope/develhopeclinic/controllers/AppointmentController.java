package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.entities.Doctor;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import co.develhope.develhopeclinic.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private I_AppointmentRepository appointmentRepository;

    @Autowired
    private AppointmentService appointmentService;

    //add single appointment using appointmentService
    @PostMapping("/addSingle")
    public Appointment addAppointment (@RequestBody Appointment appointment){
        return appointmentService.saveAppointment(appointment);
    }

    //find all appointment using appointmentService
    @GetMapping("/findAllAppointment")
    public List<Appointment> findAllAppointment (){
        return appointmentService.getAllAppointment();
    }

    //find appointment by id using appointmentService
    @GetMapping("/findAppointmentById/{id}")
    public Appointment findAppointmentById (@PathVariable int id){
        return appointmentService.getAppointmentById(id);
    }

    //update appointment by id
    @PutMapping("/update/{id}")
    public Appointment updateAppointment(@PathVariable int id, @RequestBody Appointment appointment){
        appointment.setId(id);
        return appointmentRepository.saveAndFlush(appointment);
    }

    //delete appointment by id using appointmentService
    @DeleteMapping("/delete/{id}")
    public String deleteAppointment (@PathVariable int id){
        return appointmentService.deleteAppointment(id);
    }
}
