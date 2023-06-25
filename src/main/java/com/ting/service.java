package com.ting;

public class service {

		public static User getUser(String username) {
			
			return UserDAO.getUser(username);
		}

}
