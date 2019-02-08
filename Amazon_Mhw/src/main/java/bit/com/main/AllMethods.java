package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllMethods {
	
	WebDriver dr;
	
	public AllMethods(WebDriver dr) {
		 this. dr = dr;
	}
	
	public void click(WebElement e) {
		e.click();
	}
	
	public String compare(WebElement e) {
		
		return e.getText();
	}

}
