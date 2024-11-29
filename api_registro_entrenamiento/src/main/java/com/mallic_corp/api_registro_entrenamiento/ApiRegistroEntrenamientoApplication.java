package com.mallic_corp.api_registro_entrenamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(exclude = {
	org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
}
	)
public class ApiRegistroEntrenamientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRegistroEntrenamientoApplication.class, args);
	}

}
