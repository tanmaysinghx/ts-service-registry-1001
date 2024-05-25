package com.ts.ts_service_registry_1001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TsServiceRegistry1001Application {

	public static void main(String[] args) {
		SpringApplication.run(TsServiceRegistry1001Application.class, args);
		
		System.out.println("ts-service-registry-1001 started on port number: 8761");
	}

}
