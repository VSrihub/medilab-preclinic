package com.nareshit.medilab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@EnableConfigServer
@SpringBootApplication
@RefreshScope
public class MedilabConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabConfigServerApplication.class, args);
	}

}
