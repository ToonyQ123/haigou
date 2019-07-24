package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HaigouYunyingshangApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaigouYunyingshangApplication.class, args);
	}

}
