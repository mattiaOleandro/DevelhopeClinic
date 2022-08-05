package co.develhope.develhopeclinic;

import co.develhope.develhopeclinic.entities.*;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
import co.develhope.develhopeclinic.repositories.I_PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;


@SpringBootApplication
public class DevelhopeClinicApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DevelhopeClinicApplication.class, args);
	}

		@Autowired
		private I_DoctorRepository doctorRepository;

		@Autowired
		private I_PatientRepository patientRepository;

	//override run method
	@Override
	public void run(String... args) throws Exception {

		//Person Attributtes
		Doctor doctor = new Doctor();
		doctor.setName("Gianna");
		doctor.setSurname("Boni");
		doctor.setNationality("Italiana");
		doctor.setPlaceOfBirth("Palanzano");
		doctor.setBirthDate(LocalDate.of(1993, 5, 8));
		doctor.setFiscalCode("GNNBNO93E48G255M");
		doctor.setDocumentNumber("MT75772820");
		doctor.setAddress("Piazza Giuseppe Garibaldi, 105");
		doctor.setCity("Parma");
		doctor.setPhone("0337-3305236");
		doctor.setEmail("GiannaBoni@dayrep.com");
		doctor.setGender(EnumGender.FEMALE);

		//Employee Attributtes
		doctor.setRole(EnumRole.DOCTOR);
		doctor.setLogin("Dight1993");
		doctor.setPassword("eYutaofem4j");
		doctor.setBadgeNumber("GIA-358-BON");
		doctor.setPlaceOfWork(EnumPlaceOfWork.PALERMO);

		//Employee Attributtes
		doctor.setMedicalSpecialization(EnumMedicalSpecializzation.CARDIOLOGY);

		doctorRepository.save(doctor);


		//Person Attributtes
		Doctor doctor2 = new Doctor();
		doctor2.setName("Andrew");
		doctor2.setSurname("Lowe");
		doctor2.setNationality("Inglese");
		doctor2.setPlaceOfBirth("Firenze");
		doctor2.setBirthDate(LocalDate.of(1948, 3, 18));
		doctor2.setFiscalCode("LWONRW48C18D612Q");
		doctor2.setDocumentNumber("KY75859601");
		doctor2.setAddress("Piazza Principe Umberto, 73");
		doctor2.setCity("Firenze");
		doctor2.setPhone("0351-8887306");
		doctor2.setEmail("AndrewLowe@dayrep.com");
		doctor2.setGender(EnumGender.MALE);

		//Employee Attributtes
		doctor2.setRole(EnumRole.DOCTOR);
		doctor2.setLogin("Pleged");
		doctor2.setPassword("phu4iNg1ch");
		doctor2.setBadgeNumber("AND-838-LOW");
		doctor2.setPlaceOfWork(EnumPlaceOfWork.MILANO);

		//Employee Attributtes
		doctor2.setMedicalSpecialization(EnumMedicalSpecializzation.DERMATOLOGY);

		doctorRepository.save(doctor2);

		//Person Attributtes
		Patient patient1 = new Patient();
		patient1.setName("Anna");
		patient1.setSurname("Verdi");
		patient1.setNationality("Italy");
		patient1.setPlaceOfBirth("Roma");
		patient1.setBirthDate(LocalDate.of(1998, 7, 12));
		patient1.setFiscalCode("VRDNNA98L52H501A");
		patient1.setDocumentNumber("DR75462804");
		patient1.setAddress("Via Monte Grappa, 42");
		patient1.setCity("Roma");
		patient1.setPhone("+393338974158");
		patient1.setEmail("annaverdi@gmail.com.com");
		patient1.setGender(EnumGender.FEMALE);

		//Patient Attributtes
		patient1.setMedicalPatology("Miocardite");

		patientRepository.save(patient1);

		//Person Attributtes
		Patient patient2 = new Patient();
		patient2.setName("Giovanni");
		patient2.setSurname("Rossi");
		patient2.setNationality("Italy");
		patient2.setPlaceOfBirth("Milano");
		patient2.setBirthDate(LocalDate.of(1952, 2, 21));
		patient2.setFiscalCode("RSSGNN52B21F205N");
		patient2.setDocumentNumber("EF82562344");
		patient2.setAddress("Via Roma, 154");
		patient2.setCity("Milano");
		patient2.setPhone("+393317329654");
		patient2.setEmail("giovannirossi@gmail.com");
		patient2.setGender(EnumGender.MALE);

		//Patient Attributtes
		patient2.setMedicalPatology("Blocco cardiaco");

		patientRepository.save(patient2);

	}
}
