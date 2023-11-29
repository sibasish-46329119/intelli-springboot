package com.springboot.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients// this annotation will scan the interface annoted with @feignclient
//@EnableDiscoveryClient from spring 3 no need to mention this annotation as it automatically consider it,
@EnableDiscoveryClient
public class EmployeeServiceApplication {

 // created the bean of RestTemplate so that it is available in IoC container to called whenever
//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	// before we have to import webflux dependency in pom.xml file
//	@Bean
//	public WebClient webClient(){
//		// returning the instance of Webclient
//		return WebClient.builder().build();
//	}


	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}


