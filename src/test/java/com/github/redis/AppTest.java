package com.github.redis;

import org.testng.annotations.Test;

public class AppTest {
	
	App app = new App();

	String key = "branch";
	
	@Test(priority = 1)
	public void testSetKeyAndValue() {
		String value = "karai";
		app.setKeyValue(key, value);
	}
	
	@Test(priority = 2)
	public void testGetValue() {
		app.getValue(key);
	}
	
	
}
