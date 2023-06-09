package ics499.GalaxyGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ics499.GalaxyGenerator.model.GalaxyShape;
import ics499.GalaxyGenerator.model.Universe;

@SpringBootApplication
public class GalaxyGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxyGeneratorApplication.class, args);
	}
}
