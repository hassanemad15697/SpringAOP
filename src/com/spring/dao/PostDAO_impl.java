package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostDAO_impl implements PostDAO{
	
	@Override
	public void allPosts() {
		System.out.println("My Posts");
		
	}
}
