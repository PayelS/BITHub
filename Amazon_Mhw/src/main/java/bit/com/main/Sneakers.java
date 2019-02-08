package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sneakers {
	
WebDriver dr;
	
	public  Sneakers(WebDriver dr) {
		this. dr = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy (xpath = ".//*[@id='leftNav']/ul[1]/ul/li/span/ul/div/li[4]/span/ul/div/li[6]/span/a/span") WebElement sneakers;
	
	AllMethods m = new AllMethods(dr);
	
	public ShoePage clickOnSneaker() {
		m.click(sneakers);
		return new ShoePage(dr);
	}

}
