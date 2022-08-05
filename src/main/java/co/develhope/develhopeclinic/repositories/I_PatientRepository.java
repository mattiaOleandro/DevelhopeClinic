package co.develhope.develhopeclinic.repositories;

import co.develhope.develhopeclinic.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface I_PatientRepository extends JpaRepository<Patient,Integer> {
}
