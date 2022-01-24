package com.udemy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Value("${jwt.secret}")
	private String mySecretProperty;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("**************************************************************** ");
		System.out.println("**************************************************************** ");
		System.out.println("property your-property-name value is: " + mySecretProperty);
		System.out.println("**************************************************************** ");
		System.out.println("**************************************************************** ");
	}
}
