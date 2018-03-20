package com.refiwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.refiwe",
		"com.refiwe.model",
		"com.refiwe.services",
		"com.refiwe.controller",
		"com.refiwe.repositories"})
public class PicknPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicknPayApplication.class, args);
	}
}
