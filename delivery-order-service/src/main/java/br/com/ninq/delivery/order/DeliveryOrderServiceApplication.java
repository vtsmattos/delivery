package br.com.ninq.delivery.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("br.com.ninq.delivery.order")
@EntityScan("br.com.ninq.delivery.order")
@EnableJpaRepositories("br.com.ninq.delivery.order")
@EnableTransactionManagement
@EnableWebMvc
@EnableAutoConfiguration
@EnableFeignClients
@SpringBootApplication
public class DeliveryOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryOrderServiceApplication.class, args);
	}
}