package com.sample.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.model.User;

public class UserDb {
	
	public static String[][] users;
	public static List<User>  usersData;
	
	public static Map<String, User> userProfile=new HashMap<String,User>();
	
	public UserDb(){
		
		User u1=new User("Shyamrao","Rahul","1234","shyamrao.rahul@wipro.com");
		User u2=new User("Pragnya","Behera","abcd","pragnya.behera@wipro.com");
		User u3=new User("Chinmayee","Kar","pqrs","chinmayee.kar@wipro.com");
	
		
		userProfile.put(u1.getEmail(), u1);
		userProfile.put(u2.getEmail(), u2);
		userProfile.put(u3.getEmail(), u3);
		
//		String[] user1 ={"Shyamrao","Rahul","1234","shyamrao.rahul@wipro.com"};
//		String[] user2 ={"Pragnya","Behera","abcd","pragnya.behera@wipro.com"};
//		String[] user3 ={"Chinmayee","Kar","pqrs","chinmayee.kar@wipro.com"};
//		
//		users[0]=user1;
//		users[1]=user2;
//		users[2]=user3;
//		
//		usersData=new ArrayList<User>();
	
//		usersData.add(u1);
//		usersData.add(u2);
//		usersData.add(u3);
	}
	


}
