package co.develhope.develhopeclinic;

import co.develhope.develhopeclinic.entities.*;
import co.develhope.develhopeclinic.repositories.I_AppointmentRepository;
import co.develhope.develhopeclinic.repositories.I_DoctorRepository;
import co.develhope.develhopeclinic.repositories.I_PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.time.LocalDateTime;


@SpringBootApplication
public class DevelhopeClinicApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DevelhopeClinicApplication.class, args);
	}

		@Autowired
		private I_DoctorRepository doctorRepository;

		@Autowired
		private I_PatientRepository patientRepository;

		@Autowired
		private I_AppointmentRepository appointmentRepository;

	//override run method
	@Override
	public void run(String... args) throws Exception {

		//Person Attributtes
		Doctor doctor1 = new Doctor();
		doctor1.setName("Gianna");
		doctor1.setSurname("Boni");
		doctor1.setNationality("Italiana");
		doctor1.setPlaceOfBirth("Palanzano");
		doctor1.setBirthDate(LocalDate.of(1993, 5, 8));
		doctor1.setFiscalCode("GNNBNO93E48G255M");
		doctor1.setDocumentNumber("MT75772820");
		doctor1.setAddress("Piazza Giuseppe Garibaldi, 105");
		doctor1.setCity("Parma");
		doctor1.setPhone("0337-3305236");
		doctor1.setEmail("GiannaBoni@dayrep.com");
		doctor1.setGender(EnumGender.FEMALE);

		//Employee Attributtes
		doctor1.setRole(EnumRole.DOCTOR);
		doctor1.setLogin("Dight1993");
		doctor1.setPassword("eYutaofem4j");
		doctor1.setBadgeNumber("GIA-358-BON");
		doctor1.setPlaceOfWork(EnumPlaceOfWork.PALERMO);

		//Employee Attributtes
		doctor1.setMedicalSpecialization(EnumMedicalSpecializzation.CARDIOLOGY);

		doctorRepository.save(doctor1);


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

		//New Appointment appointment1
		Appointment appointment1 = new Appointment();
		appointment1.setDoctor(doctor1);
		appointment1.setPatient(patient1);
		appointment1.setAppointmentDateTime(LocalDateTime.of(2022, 8, 10,12,00));
		appointment1.setAppointmentStatus(EnumAppointmentStatus.CONFIRMED);
		appointmentRepository.save(appointment1);

		//New Appointment appointment2
		Appointment appointment2 = new Appointment();
		appointment2.setDoctor(doctor2);
		appointment2.setPatient(patient1);
		appointment2.setAppointmentDateTime(LocalDateTime.of(2022, 9, 18,15,30));
		appointment2.setAppointmentStatus(EnumAppointmentStatus.CANCELLED);
		appointmentRepository.save(appointment2);

		//New Appointment appointment3
		Appointment appointment3 = new Appointment();
		appointment3.setDoctor(doctor1);
		appointment3.setPatient(patient2);
		appointment3.setAppointmentDateTime(LocalDateTime.of(2022, 9, 21,8,30));
		appointment3.setAppointmentStatus(EnumAppointmentStatus.CONFIRMED);
		appointmentRepository.save(appointment3);
	}
}
