package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoePage {
	
	WebDriver dr;
	
	public  ShoePage(WebDriver dr) {
		this. dr = dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy (xpath = ".//*[@id='anonCarousel1']/ol/li[2]/div[1]/a/span") WebElement skechers;
	@FindBy (xpath = ".//*[@id='a-autoid-10-announce']") WebElement color;
	@FindBy (xpath = ".//*[@id='dropdown_selected_size_name']/span/span") WebElement sizeButton;
	@FindBy (xpath = ".//*[@id='native_dropdown_selected_size_name_7']") WebElement size;
	@FindBy (xpath = ".//*[@id='add-to-cart-button']") WebElement cart;
	@FindBy (xpath = ".//*[@id='nav-cart-count']") WebElement cart1;
	
	
	AllMethods m = new AllMethods(dr);
	
	public void clickOnSkechers() {
		m.click(skechers);
	}
	
	public void clickOnColor() {
		m.click(color);
		
	}
	public void clickOnsizeButton() {
		m.click(sizeButton);
		
	}
	public void clickOnsize() {
		m.click(size);
	
	}
	public void clickToCart() {
		m.click(cart);
	}
	public String cartCount() {
		return m.compare(cart1);
	}
	
	public secondShoePage clickBack() {
		dr.navigate().back();
		dr.navigate().back();
		return new secondShoePage(dr);
	}

}
