package com.nareshit.medilab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedilabPreclinicApplication {

	/*@Autowired
	private EntityManagerFactory enityManagerFactory;*/
	
	public static void main(String[] args) {
		SpringApplication.run(MedilabPreclinicApplication.class, args);
	}

	/*@Bean
	public SessionFactory sessionFactory() {
		return enityManagerFactory.unwrap(SessionFactory.class);
	}*/
}
