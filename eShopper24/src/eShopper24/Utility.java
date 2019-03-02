package eShopper24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static boolean verifyElementDisply(WebDriver dr,By by) {
		return dr.findElement(by).isDisplayed();
		
	}
	public static void click(WebDriver dr, By by) {
		dr.findElement(by).click();
	}
	
	public static void getWebSite(WebDriver dr, String url) {
		dr.get(url);
		
	}
	

}
