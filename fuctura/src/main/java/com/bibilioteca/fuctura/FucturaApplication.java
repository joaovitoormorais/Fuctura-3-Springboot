package com.bibilioteca.fuctura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bibilioteca.fuctura")
public class FucturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FucturaApplication.class, args);
	}

}
