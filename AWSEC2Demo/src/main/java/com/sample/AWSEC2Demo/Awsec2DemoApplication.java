package com.sample.AWSEC2Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Awsec2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Awsec2DemoApplication.class, args);
	}

	@GetMapping("/api/{str}")
	public ResponseEntity<String> dummy(@PathVariable String str) {
		return ResponseEntity.ok("Hello " + str + " !! Welcome to the AWS EC2");
	}

}