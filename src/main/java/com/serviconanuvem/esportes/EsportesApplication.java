package com.serviconanuvem.esportes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EsportesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsportesApplication.class, args);
	}

}
