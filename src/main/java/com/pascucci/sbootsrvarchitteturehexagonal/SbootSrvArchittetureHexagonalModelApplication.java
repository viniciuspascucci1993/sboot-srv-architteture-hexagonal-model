package com.pascucci.sbootsrvarchitteturehexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableFeignClients
@SpringBootApplication
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class SbootSrvArchittetureHexagonalModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootSrvArchittetureHexagonalModelApplication.class, args);
	}

}
