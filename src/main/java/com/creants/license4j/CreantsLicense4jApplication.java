package com.creants.license4j;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LamHa
 *
 */
@SpringBootApplication
public class CreantsLicense4jApplication {
	public static void main(String[] args) {
		System.setProperty("log4j.configurationFile", "config/log4j2.xml");
		PropertyConfigurator.configure("config/log4j.properties");
		SpringApplication.run(CreantsLicense4jApplication.class, args);
	}
}
