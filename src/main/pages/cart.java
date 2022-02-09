package main.pages;

import org.openqa.selenium.By;

public class cart {

	public static final By Product_Name = By.className("inventory_item_name");
	public static final By Product_Price = By.className("item_pricebar");
	public static final By checkout = By.id("checkout");
	
	public static String cart_prod_name;
	public static String cart_prod_price;
}
