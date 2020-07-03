package com.sample.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sample.model.User;

public class UserServiceTest {

	@Test
	public void testIsAutherozied() {
		User u1=new User("Chinmayee","Kar","pqrs","chinmayee.kar@wipro.com");
		assertEquals(true,new UserService().isAuthorized(u1));
	}

	@Test
	public void testUpdatePassword() {
		User u1=new User("","","9876","shyamrao.rahul@wipro.com");
		assertEquals(true,new UserService().updatePassword(u1));
	}

	@Test
	public void testDoRegistration() {
		User u1=new User("PRAGNYA","PB","1234","pBehera@wipro.com");
		assertEquals(true,new UserService().doRegistration(u1));
	}

}
