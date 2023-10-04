package com.example.springcloudcircuitbreakerbookstore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@SpringBootApplication
public class SpringCloudCircuitBreakerBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCircuitBreakerBookstoreApplication.class, args);
	}
	  
}
