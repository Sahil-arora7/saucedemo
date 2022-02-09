package main.pages;

import org.openqa.selenium.By;

public class ProductPage {

	public static final By ProductName = By.xpath("//*[contains(text(),'Sauce Labs Bike Light')]");
	public static final By ProductPrice = By.xpath("(//div[@class='pricebar'])[2]");
	public static final By Cartbutton = By.className("shopping_cart_link");
	public static final By Addtocart = By.id("add-to-cart-sauce-labs-bike-light");
	
	public static String prodname;
	public static String prodprice;
	
}
