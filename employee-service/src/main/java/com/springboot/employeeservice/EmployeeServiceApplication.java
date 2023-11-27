package com.springboot.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeServiceApplication {

 // created the bean of RestTemplate so that it is available in IoC container to called whenever
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}


