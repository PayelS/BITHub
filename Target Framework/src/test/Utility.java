package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	public static void click(WebDriver dr, By by) {
		dr.findElement(by).click();
		}
	public static void click(WebElement ele) {
		ele.click();
		}
	public static void click(List<WebElement> elements, int index) {
		elements.get(index).click();
		
	}
	public static void type(WebDriver dr,By by, String s) {
		dr.findElement(by).sendKeys(s);
		
	}
	public static boolean verifyTitle(WebDriver dr, String expectedTitle) {
		return dr.getTitle().equals(expectedTitle);
	}
	public static String getUrl(WebDriver dr) {
		return dr.getCurrentUrl();
	}
	public static String getAttributeValue(WebDriver dr, By by, String s) {
		return dr.findElement(by).getAttribute(s);
	}
	public static String getText(WebDriver dr, By by) {
		return dr.findElement(by).getText();
	}
	public static boolean verifyElementDisply(WebDriver dr,By by) {
		return dr.findElement(by).isDisplayed();
	}
	public static boolean verifyElementEnable(WebDriver dr, By by) {
		return dr.findElement(by).isEnabled();
	}
	public static boolean verifyElementIsSelected(WebDriver dr, By by) {
		return dr.findElement(by).isSelected();
	}
	public static void getWebsite(WebDriver dr, String url) {
		dr.get(url);
	}

}
