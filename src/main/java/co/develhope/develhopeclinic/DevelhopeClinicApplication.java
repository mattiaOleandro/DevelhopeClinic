package co.develhope.develhopeclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"co.develhope.develhopeclinic.DevelhopeClinicApplication"})
@SpringBootApplication
public class DevelhopeClinicApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevelhopeClinicApplication.class, args);
	}

}
