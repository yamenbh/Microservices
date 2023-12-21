package com.aitelbhiri;

import com.aitelbhiri.entities.Client;
import com.aitelbhiri.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(1L, "Amine SAFI", 23f));
			clientRepository.save(new Client(2L, "Amal Alaoui", 22f));
			clientRepository.save(new Client(3L, "Samir RAMI", 22f));
		};
	}

}
