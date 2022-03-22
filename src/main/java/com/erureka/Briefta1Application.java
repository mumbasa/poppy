package com.erureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Briefta1Application {

	public static void main(String[] args) {
		SpringApplication.run(Briefta1Application.class, args);
	}

}
