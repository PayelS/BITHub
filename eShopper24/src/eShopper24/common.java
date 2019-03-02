package eShopper24;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class common {
	public void shop(WebDriver dr) throws InterruptedException {
		
		Utility.getWebSite(dr, Repository.baseUrl);
		boolean r = Utility.verifyElementDisply(dr, By.xpath(Repository.homePageLogo));
		if( r = Utility.verifyElementDisply(dr, By.xpath(Repository.homePageLogo))) {
			System.out.println("Logo is displyed");
		}else {
			System.out.println("Logo is not displyed");
		}
		//System.out.println(r);
		Utility.click(dr,By.xpath(Repository.clickOnCotton) );
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scroll(0,500)");
		
		Utility.click(dr, By.xpath(Repository.clickOnPage));
		Thread.sleep(3000);
		
		boolean p = Utility.verifyElementDisply(dr, By.xpath(Repository.previousButton));
		
		if(p = Utility.verifyElementDisply(dr, By.xpath(Repository.previousButton))) {
			System.out.println("Previous Button is Displyed");
		}else {
			System.out.println("Not Displyed");
		}
		//System.out.println(p);
	}

	

}
