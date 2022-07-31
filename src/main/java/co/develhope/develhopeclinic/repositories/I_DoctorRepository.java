package co.develhope.develhopeclinic.repositories;

import co.develhope.develhopeclinic.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface I_DoctorRepository extends JpaRepository<Doctor,Integer> {

    Doctor findByName(String name);
}
