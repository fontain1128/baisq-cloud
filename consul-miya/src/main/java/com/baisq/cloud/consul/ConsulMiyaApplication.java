package com.baisq.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulMiyaApplication.class, args);
	}
}
