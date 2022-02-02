package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class Data {
	
	@Before("execution(public * com.spring.*.*.*(..))")
	public void start()
	{
		System.out.println("Start Connection");
	}
	@After("execution(public * com.spring.*.*.*(..))")
	public void end()
	{
		System.out.println("end Connection");
	}
}
