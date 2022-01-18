package com.joel.sprint.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CuentasApplication {
	  @Bean
	    public RestTemplate getresttemplate() {
	        return new RestTemplate();
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(CuentasApplication.class, args);
	}

}
