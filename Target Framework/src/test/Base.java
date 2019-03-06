package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver dr;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/Payel/Downloads/chromedriver"); 
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return dr;
	}
	public void closeDriver() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}

}
