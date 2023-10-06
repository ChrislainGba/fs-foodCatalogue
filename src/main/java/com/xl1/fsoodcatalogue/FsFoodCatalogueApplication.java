package com.xl1.fsoodcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FsFoodCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsFoodCatalogueApplication.class, args);
	}
	
	@Bean
	//we can get many instances so eureka can loadBalance
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
