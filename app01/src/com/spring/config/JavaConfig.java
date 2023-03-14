package com.spring.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.beans.Hello;
import com.spring.beans.Welcome;
import com.spring.threads.ThreadScope;

@Configuration
public class JavaConfig {
	
	@Bean("hello")
	@Scope("thread")
	public Hello getHello() {
		return new Hello();
	}
	
	@Bean("welcome")
	public Welcome getWelcome() {
		return new Welcome();
	}
	
	@Bean
	public static CustomScopeConfigurer getCustomScopeConfigurer() {
		CustomScopeConfigurer scopeConfig = new CustomScopeConfigurer();
		scopeConfig.addScope("thread", new ThreadScope());
		return scopeConfig;
		
	}

}
