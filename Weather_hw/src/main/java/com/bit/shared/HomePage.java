package com.bit.shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver dr;
	
	
	@FindBy (xpath = ".//*[@id='title']/span[1]/span[2]/span[1]") WebElement forcast;
	
	
	public HomePage(WebDriver dr) {
	      this.dr = dr;
	      PageFactory.initElements(dr, this);
	}
	
	AllMethods m = new AllMethods();
	
	
	public void getWeather() {
		//m.varify(forcast);
		
		if(forcast.isDisplayed()) {
			System.out.println("Weather is Displyed.");
			System.out.println();
		}else {
			System.out.println("not displyed");
		}	
		
	}
	

	public void temperature() {
		String s = forcast.getText();
		
		
		String f = s.replaceAll("[^a-zA-Z]", " ");
		
		System.out.println("Overcast Text:" + f);
		System.out.println();
		
		if(!f.isEmpty()) {
			System.out.println("Overcast: displyed");
			
			System.out.println();
		}else {
			System.out.println("Overcast : not displyed ");
		}
		
		
		int i = Integer.parseInt(forcast.getText().replaceAll("[^0-9]", ""));
		
		System.out.println("Today's Temperature is  " + i + "°F");
		System.out.println();

		int minValue = 50;
		
		int maxValue = 80;
		 
		
		if (i >= minValue && i <= maxValue)
			
		       System.out.println( i + " is in Between 50 and 80");
		    else
		       System.out.println( i + " is NOT in Between 50 and 80");
				
	}
	
	

	
}
