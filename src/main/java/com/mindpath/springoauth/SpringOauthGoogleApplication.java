package com.mindpath.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mindpath.springoauth.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringOauthGoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthGoogleApplication.class, args);
	}

}