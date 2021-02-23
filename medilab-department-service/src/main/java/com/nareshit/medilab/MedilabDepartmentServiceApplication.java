package com.nareshit.medilab;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class MedilabDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabDepartmentServiceApplication.class, args);
	}
	
	@Bean
	public Validator localValidatorFactory() {
		return  new LocalValidatorFactoryBean();
	}

}
