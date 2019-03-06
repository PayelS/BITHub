package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.test.Utility;

public class Common {
	public void tergetPurchese(WebDriver dr) throws InterruptedException {
		Utility.getWebsite(dr, Repository.targetBaseURL);
		Thread.sleep(3000);
		
		Utility.verifyElementDisply(dr, By.xpath(Repository.homeBasePageLogo));
		
		
		Utility.click(dr.findElement(By.xpath(Repository.categories)));
		
		Utility.click(dr, By.xpath(Repository.thanksgiving));
//		Utility.type(dr, By.xpath(Repository.search), Repository.s);
//		Utility.click(dr.findElement(By.cssSelector(Repository.clickOnSearch)));
//		Utility.click(dr, By.xpath(Repository.clickOnLink));
//		dr.navigate().refresh();
//		Utility.click(dr.findElement(By.xpath(Repository.color)));
////		dr.navigate().refresh();
//		Utility.click(dr, By.xpath(Repository.size));
//		Utility.click(dr, By.xpath(Repository.addToCart));
//		//dr.navigate().refresh();
//		Utility.click(dr, By.xpath(Repository.checkout));
//		
	}
	

}

