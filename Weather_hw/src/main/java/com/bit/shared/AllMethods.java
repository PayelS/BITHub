package com.bit.shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllMethods {
	
	
	
	
	public void varify(WebElement ele) {
		 ele.isDisplayed();
	}
	
	public boolean verifyTitle(WebDriver dr, String expectedTitle) {
		return dr.getTitle().equals(expectedTitle);
	}

	
	public  String getText(WebElement ele) {
		return ele.getText();
	}
	
	
	
	public boolean between(int i, int minValueInclusive, int maxValueInclusive) {
	    if (i >= minValueInclusive && i <= maxValueInclusive)
	        return true;
	    else
	        return false;
	}
	
}
