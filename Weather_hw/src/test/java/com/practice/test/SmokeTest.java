package com.practice.test;

import org.junit.Test;

import com.bit.shared.HomePage;

public class SmokeTest extends Base {
	@Test
	public void run() {
		
		HomePage homePage = new HomePage(dr);
		
		 homePage.getWeather();
		 homePage.temperature();
		 
		
	}

}
