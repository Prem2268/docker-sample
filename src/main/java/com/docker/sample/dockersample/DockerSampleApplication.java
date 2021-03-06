package com.docker.sample.dockersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSampleApplication.class, args);
	}
	
	@RequestMapping("/entry")
	public String enrtryPoint() {
		return "Hello World Docker";
	}

}
