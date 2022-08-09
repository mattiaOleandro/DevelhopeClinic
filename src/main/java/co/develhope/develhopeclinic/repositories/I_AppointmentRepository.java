package co.develhope.develhopeclinic.repositories;

import co.develhope.develhopeclinic.entities.Appointment;
import co.develhope.develhopeclinic.entities.Doctor;
import co.develhope.develhopeclinic.entities.EnumAppointmentStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface I_AppointmentRepository extends JpaRepository<Appointment,Integer> {

    @Query("select a from Appointment a where a.appointmentStatus = :appointmentStatus")
    Page<Appointment> findAllByStatus(@Param("appointmentStatus") EnumAppointmentStatus appointmentStatus,
                                      Pageable pageable);

    @Query(value = "SELECT a.appointment_date_time, d.surname AS 'Doctor', p.surname AS 'Patient' FROM appointment AS a " +
            "JOIN `doctor_tbl` AS d ON d.id = a.doctor_id " +
            "JOIN `patient_table` AS p ON p.id = a.patient_id " +
            "WHERE d.fiscal_code = :fiscalCode",
            nativeQuery = true)
    Page<Object[]> findAllByDoctorFiscalCode(@Param("fiscalCode") String fiscalCode, Pageable pageable);
}
