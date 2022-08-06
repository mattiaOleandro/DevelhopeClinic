package co.develhope.develhopeclinic.services;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private I_AppointmentRepository appointmentRepository;

    public Appointment saveAppointment (Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointment (){
        return  appointmentRepository.findAll();
    }

    public Appointment getAppointmentById (int id){
        return  appointmentRepository.findById(id).orElse(null);
    }

    public String deleteAppointment (int id){
        appointmentRepository.deleteById(id);
        return "Appointment n° " + id + " has been removed!";
    }
}
