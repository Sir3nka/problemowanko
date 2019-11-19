package com.sirenka.datamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataManager {
	public static void main(String[] args) {
		SpringApplication.run(DataManager.class, args);
	}

}

