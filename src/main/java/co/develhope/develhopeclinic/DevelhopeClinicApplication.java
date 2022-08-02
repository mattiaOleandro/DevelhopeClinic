package co.develhope.develhopeclinic;

import co.develhope.develhopeclinic.entities.*;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
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
		Doctor doctor3 = new Doctor();
		doctor3.setName("Andrew");
		doctor3.setSurname("Lowe");
		doctor3.setNationality("Inglese");
		doctor3.setPlaceOfBirth("Firenze");
		doctor3.setBirthDate(LocalDate.of(1948, 3, 18));
		doctor3.setFiscalCode("LWONRW48C18D612Q");
		doctor3.setDocumentNumber("KY75859601");
		doctor3.setAddress("Piazza Principe Umberto, 73");
		doctor3.setCity("Firenze");
		doctor3.setPhone("0351-8887306");
		doctor3.setEmail("AndrewLowe@dayrep.com");
		doctor3.setGender(EnumGender.MALE);

		//Employee Attributtes
		doctor3.setRole(EnumRole.DOCTOR);
		doctor3.setLogin("Pleged");
		doctor3.setPassword("phu4iNg1ch");
		doctor3.setBadgeNumber("AND-838-LOW");
		doctor3.setPlaceOfWork(EnumPlaceOfWork.MILANO);

		//Employee Attributtes
		doctor3.setMedicalSpecialization(EnumMedicalSpecializzation.DERMATOLOGY);

		doctorRepository.save(doctor3);
	}
}
