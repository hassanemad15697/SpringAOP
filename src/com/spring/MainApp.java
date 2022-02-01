package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.Container;
import com.spring.dao.PostDAO;
import com.spring.dao.PostDAO_impl;
import com.spring.dao.PostService;
import com.spring.model.User;

public class MainApp {
	
	
	public static void main(String[] arg) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Container.class);
		
		PostDAO postDAO = context.getBean("postDAO_impl",PostDAO.class);
		
		PostService postService = context.getBean("postService_Impl",PostService.class);
		
		User u = new User();
		
		postDAO.allPosts(u);
		System.out.println(postDAO.allLikes());
		System.out.println("____________________________________");
		System.out.println(postService.allPosts()); ;
		postService.allLikes(u);
		
	}
 }
