package com.baisq.cloud.demo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZipkinHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinHiApplication.class, args);
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
}
