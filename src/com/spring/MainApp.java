package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.Container;
import com.spring.dao.PostDAO;
import com.spring.dao.PostDAO_impl;

public class MainApp {
	
	
	public static void main(String[] arg) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Container.class);
		
		PostDAO postDAO = context.getBean("postDAO_impl",PostDAO.class);
		
		postDAO.allPosts();
	}
 }
