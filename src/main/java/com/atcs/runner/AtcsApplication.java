package com.atcs.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.atcs" })
public class AtcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtcsApplication.class, args);
	}
}
