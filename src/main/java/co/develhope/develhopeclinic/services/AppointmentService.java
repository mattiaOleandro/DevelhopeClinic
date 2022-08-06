package co.develhope.develhopeclinic.services;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public Appointment updateSingleAppointment(int id, Appointment appointment){
        appointment.setId(id);
        Appointment newAppointment = appointmentRepository.saveAndFlush(appointment);
        boolean existsById = appointmentRepository.existsById(id);
        if(existsById){
            //modify a single Appointment - if the id is in the db
            return appointment;
        }
        //returns an empty Appointment if the id is NOT in the db
        return new Appointment();
    }
    public String deleteAppointment (int id){
        appointmentRepository.deleteById(id);
        return "Appointment n° " + id + " has been removed!";
    }
}
