package com.serviconanuvem.esportes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EsportesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsportesApplication.class, args);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello :)", HttpStatus.OK);
	}

}
