package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDAO_impl implements PostDAO{
	
	@Override
	public void allPosts(User u) {
		System.out.println("DAO - My Posts");

		throw new RuntimeException("end3 Exception");
	}

	@Override
	public String allLikes() {
		return "DAO - My Likes";
	}
}
