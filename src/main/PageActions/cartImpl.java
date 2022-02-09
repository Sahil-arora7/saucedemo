package main.PageActions;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.ProductPage;
import main.pages.cart;
import main.utilities.CoreActions;

public class cartImpl extends CoreActions{

	protected cartImpl(WebDriver bot) {
		super(bot);
	}
	
	@Step("verifying the product name")
	public void nameverify() {
		cart.cart_prod_name = textRetriever(cart.Product_Name);
		Assert.assertEquals(cart.cart_prod_name,ProductPage.prodname);
	}
	
	@Step("verifying the product price")
	public void priceverify() {
		cart.cart_prod_price = textRetriever(cart.Product_Price);
		cart.cart_prod_price = cart.cart_prod_price.substring(0,5);
		Assert.assertEquals(cart.cart_prod_price,ProductPage.prodprice.substring(0, 5));
	}
	
	@Step("click on checkout")
	public checkoutimpl clickcheckout() {
		click(cart.checkout);
		return new checkoutimpl(bot);
	}
	

}
