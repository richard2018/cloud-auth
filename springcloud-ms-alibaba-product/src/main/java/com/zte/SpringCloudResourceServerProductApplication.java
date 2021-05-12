package com.zte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudResourceServerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudResourceServerProductApplication.class, args);
	}

}
