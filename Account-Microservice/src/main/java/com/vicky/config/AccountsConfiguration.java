package com.vicky.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "accounts")
@Data
public class AccountsConfiguration {
	
	private String city;

}
