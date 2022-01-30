package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class DataBase {

	@Before("execution(public void allPosts())")
	public void connectionDB() {
		System.out.println("Connected.....!");
	}
}