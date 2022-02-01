package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostDAO_impl implements PostDAO{
	
	@Override
	public void allPosts() {
		System.out.println("DAO - My Posts");
	}

	@Override
	public String allLikes() {
		return "DAO - My Likes";
	}
}
