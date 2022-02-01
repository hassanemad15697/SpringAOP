package com.spring.dao;

import com.spring.model.User;

public interface PostDAO {
	public void allPosts(User u);
	public String allLikes();
}
