package com.plg.keycloakapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakAppApplication.class, args);
		System.out.println("Server run");
	}

}
