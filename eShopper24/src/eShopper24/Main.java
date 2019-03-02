package eShopper24;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Main {
	
	@Test
	public void test() throws InterruptedException {
		Base b = new Base();
		WebDriver dr = b.getDriver();
		common c = new common();
		c.shop(dr);
		Thread.sleep(2000);
		b.closeDriver();
		
	}
	
	

}
