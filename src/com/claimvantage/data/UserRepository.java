package com.claimvantage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.claimvantage.model.Rule;
import com.claimvantage.model.User;

public class UserRepository {
	
	private static UserRepository instance = null;
	private ArrayList<User> users;

	private UserRepository () {
		users = new ArrayList<User>();
	}
	
	
	public static UserRepository instance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public static UserRepository getInstance() {
		return instance;
	}

	public static void setInstance(UserRepository instance) {
		UserRepository.instance = instance;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}
