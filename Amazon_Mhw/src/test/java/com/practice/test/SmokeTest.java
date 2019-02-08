package com.practice.test;

import org.junit.Test;

import bit.com.main.HomePage;
import bit.com.main.ShoePage;
import bit.com.main.Shoes;
import bit.com.main.Sneakers;
import bit.com.main.secondShoePage;

public class SmokeTest extends Open_Close_Browser{
	
	@Test
	public void testRun() throws InterruptedException {
		String cartOne, cartTwo;
		
		HomePage homepage = new HomePage(dr);
		homepage.clickOnMenu();
		Thread.sleep(2000);
		homepage.clickOnClothes();
		Shoes shoes = homepage.clickOnWomen();
		Thread.sleep(2000);
		Sneakers sneakers = shoes.clickOnShoes();
		ShoePage shoePage = sneakers.clickOnSneaker();
		shoePage.clickOnSkechers();
		Thread.sleep(2000);
		shoePage.clickOnColor();
		Thread.sleep(2000);
		shoePage.clickOnsizeButton();
		Thread.sleep(2000);
		shoePage.clickOnsize();
		Thread.sleep(2000);
		shoePage.clickToCart();
		Thread.sleep(2000);
		cartOne = shoePage.cartCount();
		secondShoePage SecondShoePage = shoePage.clickBack();
		Thread.sleep(2000);
		SecondShoePage.clickOnAdidas();
		Thread.sleep(2000);
		SecondShoePage.clickOnDropDown();
		Thread.sleep(2000);
		SecondShoePage.clickOnColor();
		Thread.sleep(2000);
		SecondShoePage.clickOnsizeButton();
		Thread.sleep(2000);
		SecondShoePage.clickOnsize();
		Thread.sleep(2000);
		SecondShoePage.clickToCart();
		Thread.sleep(2000);
		cartTwo = SecondShoePage.cartCount();
		
		if (cartOne.equals(cartTwo))
			System.out.println("Cart is NOT update");
		else
			System.out.println("Cart is updated");
		
		
		
		
	}

}
