package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class Data {
	
	@Before("execution(public * com.spring.*.*.*(..))")
	public void main()
	{
		System.out.println("Start Connection");
	}
}
