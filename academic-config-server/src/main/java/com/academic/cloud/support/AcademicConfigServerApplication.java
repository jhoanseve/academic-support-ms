package com.academic.cloud.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AcademicConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicConfigServerApplication.class, args);
	}

}
