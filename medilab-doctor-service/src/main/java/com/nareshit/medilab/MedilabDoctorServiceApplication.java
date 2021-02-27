package com.nareshit.medilab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MedilabDoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabDoctorServiceApplication.class, args);
	}

}
