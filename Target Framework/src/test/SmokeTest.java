package test;

import org.openqa.selenium.WebDriver;

public class SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		
		Base b = new Base();
		
		WebDriver dr = b.getDriver();
		
		Common c = new Common();
		
		c.tergetPurchese(dr);
		
		b.closeDriver();
		
		
		
	}

}
