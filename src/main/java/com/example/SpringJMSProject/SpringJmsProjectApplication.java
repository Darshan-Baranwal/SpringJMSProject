package com.example.SpringJMSProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
/*
use @EnableJms
 */
@SpringBootApplication
@EnableJms
public class SpringJmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsProjectApplication.class, args);
	}

}
