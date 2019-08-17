package br.com.ninq.delivery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DeliveryGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryGatewayServerApplication.class, args);
	}
}