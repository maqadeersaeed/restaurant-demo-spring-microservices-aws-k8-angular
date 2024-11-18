package com.maqs.foodcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FoodCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodCatalogueServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced // !!! By Setting This Eureka will Choose best available from all isntances of a service and send most appropriate.
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
