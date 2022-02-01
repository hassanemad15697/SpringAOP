package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostService_Impl implements PostService {

	@Override
	public String allPosts() {
		return "Services - My Services";
	}

	@Override
	public void allLikes() {
		System.out.println("Services - My Likes");
	}

}
