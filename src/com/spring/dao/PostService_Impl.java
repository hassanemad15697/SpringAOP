package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostService_Impl implements PostService {

	@Override
	public String allPosts() {
		return "Services - My Services";
	}

	@Override
	public void allLikes(User u) {
		System.out.println("Services - My Likes");
	}

}
