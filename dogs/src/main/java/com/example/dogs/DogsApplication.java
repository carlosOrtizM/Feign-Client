package com.example.dogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogsApplication.class, args);
	}

}
