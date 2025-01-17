package com.MeuCarroMinhaVida.AppFinanciamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppFinanciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppFinanciamentoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Hello from Spring Boot";
	}
}
