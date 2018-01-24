package com.java1234.service;

import com.java1234.model.PageBean;
import com.java1234.model.User;

import java.util.List;

public interface UserService {

	public User login(User user);
	
	public List<User> find(PageBean pageBean, User s_user);
	
	public int count(User s_user);
	
	public void delete(int id);
	
	public void add(User user);
	
	public void update(User user);
	
	public User loadById(int id);
	
	public boolean existUserByDeptId(int deptId);
}
