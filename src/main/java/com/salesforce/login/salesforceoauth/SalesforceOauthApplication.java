package com.salesforce.login.salesforceoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SalesforceOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesforceOauthApplication.class, args);
	}
}
