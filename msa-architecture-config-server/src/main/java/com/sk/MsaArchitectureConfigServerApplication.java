package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsaArchitectureConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaArchitectureConfigServerApplication.class, args);
	}

}
