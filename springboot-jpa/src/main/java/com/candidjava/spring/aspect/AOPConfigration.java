package com.candidjava.spring.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.candidjava.spring.service.UserService;
import com.candidjava.spring.service.UserServiceImpl;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfigration {

	@Bean
	public LogService logService() {
		return new LogService();
	}

	@Bean(name = "userService")
	public UserService userService() {
		return new UserServiceImpl();
	}

}
