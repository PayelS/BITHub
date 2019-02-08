package bit.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondShoePage {
	
WebDriver dr;
	
	public  secondShoePage(WebDriver dr) {
		this. dr = dr;
		PageFactory.initElements(dr, this);
	}
	//@FindBy (xpath = ".//*[@id='anonCarousel2']/ol/li[3]") WebElement adidas;
	@FindBy (xpath = ".//*[@id='anonCarousel1']/ol/li[3]/div[1]/a/span") WebElement adidas;
	//@FindBy (xpath = ".//*[@id='a-autoid-10-announce']") WebElement color;
	@FindBy (xpath = ".//*[@id='dropdown_selected_color_name']/span/span") WebElement dropDwon;
	
	@FindBy (xpath = ".//*[@id='native_dropdown_selected_color_name_22']") WebElement color;
	@FindBy (xpath = ".//*[@id='dropdown_selected_size_name']/span/span") WebElement sizeButton;
	@FindBy (xpath = ".//*[@id='native_dropdown_selected_size_name_7']") WebElement size;
	@FindBy (xpath = ".//*[@id='add-to-cart-button']") WebElement cart;
	@FindBy (xpath = ".//*[@id='nav-cart-count']") WebElement cart2;
	
	
	AllMethods m = new AllMethods(dr);
	
	public void clickOnAdidas() {
		m.click(adidas);
	}
	
	public void clickOnDropDown() {
		m.click(dropDwon);
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
		return m.compare(cart2);
	}

}
