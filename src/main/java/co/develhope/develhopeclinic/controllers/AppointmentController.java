package co.develhope.develhopeclinic.controllers;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.entities.Doctor;
import co.develhope.develhopeclinic.entities.EnumAppointmentStatus;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
import co.develhope.develhopeclinic.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private I_AppointmentRepository appointmentRepository;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private I_DoctorRepository doctorRepository;


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

    //update appointment by id using appointmentService
    @PutMapping("/update/{id}")
    public Appointment updateSingleAppointment(@PathVariable int id, @RequestBody Appointment appointment){
        return appointmentService.updateSingleAppointment(id, appointment);
    }

    //delete appointment by id using appointmentService
    @DeleteMapping("/delete/{id}")
    public String deleteAppointment (@PathVariable int id){
        return appointmentService.deleteAppointment(id);
    }

    //find all appointments by status
    @GetMapping("/findAllByStatus")
    public Page<Appointment> getAllFlightsByStatus(@RequestParam EnumAppointmentStatus appointmentStatus,
                                                   @RequestParam int page, @RequestParam int size){
        return appointmentRepository.findAllByStatus(appointmentStatus, (PageRequest.of(page, size)));
    }

    @GetMapping("/getAllByDoctorFiscalCode")
    public List<Object[]> getAllByDoctorFiscalCode(@RequestParam String fiscalCode){
        return appointmentRepository.findAllByDoctorFiscalCode(fiscalCode);
    }
}
