package com.practice.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver dr;
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/Payel/Downloads/chromedriver"); 
		dr = new ChromeDriver();
		dr.get("https://darksky.net");
	}
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}

}
