package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver dr;
	
	public  HomePage(WebDriver dr) {
		this. dr = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy (xpath = ".//*[@id='nav-hamburger-menu']/i") WebElement menu;
	@FindBy (xpath = ".//*[@id='hmenu-content']/ul[33]/li[10]/a") WebElement clothes;
	@FindBy (xpath = ".//*[@id='hmenu-content']/ul[8]/li[4]/a/div") WebElement women;
	
	AllMethods m = new AllMethods(dr);
	
	public void clickOnMenu() {
		m.click(menu);
	}
	public void clickOnClothes() {
		m.click(clothes);
	}
	public Shoes clickOnWomen() {
		m.click(women); 
		return new Shoes(dr);
	}
		

}
