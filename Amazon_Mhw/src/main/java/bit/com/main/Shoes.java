package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoes {
	
WebDriver dr;
	
	public  Shoes(WebDriver dr) {
		this. dr = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy (xpath = ".//*[@id='leftNav']/ul[1]/ul/li/span/ul/div/li[4]/span/a/span") WebElement shoes;
	
	AllMethods m = new AllMethods(dr);
	
	public Sneakers clickOnShoes() {
		m.click(shoes);
		return new Sneakers(dr);
	}

}
