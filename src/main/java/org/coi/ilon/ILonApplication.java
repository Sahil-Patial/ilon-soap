package org.coi.ilon;

import org.coi.ilon.client.SoapClient;
import org.coi.ilon.config.SoapConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ILonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ILonApplication.class, args);
	}

}
