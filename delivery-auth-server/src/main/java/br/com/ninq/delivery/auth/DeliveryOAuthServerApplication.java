package br.com.ninq.delivery.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class DeliveryOAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryOAuthServerApplication.class, args);
	}
}