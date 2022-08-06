package co.develhope.develhopeclinic.repositories;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.entities.EnumAppointmentStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface I_AppointmentRepository extends JpaRepository<Appointment,Integer> {

    @Query("select a from Appointment a where a.appointmentStatus = :appointmentStatus")
    Page<Appointment> findAllByStatus(@Param("appointmentStatus") EnumAppointmentStatus appointmentStatus, Pageable pageable);
}
