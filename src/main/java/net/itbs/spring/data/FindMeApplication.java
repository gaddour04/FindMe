package net.itbs.spring.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import net.itbs.spring.data.entites.Adresse;
import net.itbs.spring.data.repositories.AdresseRepository;

@SpringBootApplication
public class FindMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindMeApplication.class, args);
	}
	@Bean
	CommandLineRunner start(AdresseRepository adresseRep,RepositoryRestConfiguration restconfiguration) {
		return args -> {
			restconfiguration.exposeIdsFor(Adresse.class);
			
		};
	}

}
