package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class DataBase {

	@Pointcut("execution(public * com.spring.*.*.*(..))")
	public void myPointCut()
	{
		
	}
	
	
	@Before("myPointCut()")
	public void connectionDB() {
		System.out.println("Connected.....!");
	}
}
