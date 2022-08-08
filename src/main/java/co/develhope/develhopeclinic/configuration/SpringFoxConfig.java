package co.develhope.develhopeclinic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Develhope Clinic",
                """
                        The polyclinic is a tool that performs specialist visits and diagnostic examinations in agreement
                        with the National Health System. Specialist visits are performed without hospitalization:
                        physiotherapy, orthopedic examinations, eye examinations, psychological examinations,
                        diagnostic imaging examinations (X-rays, CT scans, MRIs, etc.)\s""",
                "1.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("Angelo", "https://develhope.co", "juba.kem@gmail.com"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo);
              /*
                .tags(
                        new Tag("default-controller", "The main initial controller for all the API features"),
                        new Tag("math-controller", "Controller dedicated just to API > math operations")
                );*/
    }

}
