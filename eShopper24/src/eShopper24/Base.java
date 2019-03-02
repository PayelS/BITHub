package eShopper24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver dr;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/Payel/Downloads/chromedriver"); 
		 dr = new ChromeDriver();
		 return dr;
	}
	
	public void closeDriver() {
		dr.quit();
		
		
	}
	
	

}
