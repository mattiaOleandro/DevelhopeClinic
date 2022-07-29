package develhopeclinic.repositories;

import develhopeclinic.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_DoctorRepository extends JpaRepository<Doctor,Integer> {
    Doctor findByName(String name);
}
