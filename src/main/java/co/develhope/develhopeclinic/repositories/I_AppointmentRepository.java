package co.develhope.develhopeclinic.repositories;

import co.develhope.develhopeclinic.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface I_AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
