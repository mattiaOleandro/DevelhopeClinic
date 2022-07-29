package develhopeclinic.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DOCTOR_TBL")
public class Doctor {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private int age;
    private LocalDate birthDate;
    private String medicRole;


}
