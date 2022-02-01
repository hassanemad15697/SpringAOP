package com.spring.dao;

import com.spring.model.User;

public interface PostService {
	public String allPosts();
	public void allLikes(User u);
}
