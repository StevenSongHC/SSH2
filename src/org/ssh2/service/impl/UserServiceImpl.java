package org.ssh2.service.impl;

import java.util.List;

import org.ssh2.bean.User;
import org.ssh2.dao.UserDAO;
import org.ssh2.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}
