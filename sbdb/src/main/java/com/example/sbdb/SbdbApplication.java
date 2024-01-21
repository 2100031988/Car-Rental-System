package com.example.sbdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.example.sbdb")
public class SbdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdbApplication.class, args);
	}

}
			