package test.TestCases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import main.PageActions.cartImpl;
import main.PageActions.checkoutimpl;
import main.PageActions.completeimpl;
import main.PageActions.homePageImpl;
import main.PageActions.overviewimpl;
import main.PageActions.prodpageimpl;
import test.basic.baseclass;


public class testcase1 extends baseclass{

	homePageImpl homepageobject;
	prodpageimpl productobject;
	cartImpl cartObject;
	checkoutimpl checkoutObject;
	overviewimpl overviewObject;
	completeimpl completeObject;
	
	@Test(priority = 1)
	public void initiate() {
		homepageobject = new homePageImpl(bot);
		
	}
	@Test(priority = 2)
	@Description("Homepage login credentials")
	public void loginsite() {
		
		stepLog("verifying that correct site is opened");
		homepageobject.verifySite();
		
		stepLog("enter username");
		homepageobject.enterUserName();

		stepLog("enter password");
		homepageobject.enterPassword();
		

		stepLog("click login button");
		productobject = homepageobject.login();
		
	}
	
	@Test(priority = 3)
	@Description("product page")
	public void productpage() {
		stepLog("get the name of item before clicking");
		productobject.getnamebefore();
		
		stepLog("add item to cart");
		productobject.clickAddCart();
		
		stepLog("click on the cart icon");
		cartObject = productobject.clickcart();
	}
	
	@Test(priority = 4)
	@Description("cart page")
	public void cartpage() {
		stepLog("verifying the name");
		cartObject.nameverify();
		
		stepLog("verifying the price");
		cartObject.priceverify();
		
		stepLog("clicking the checkout");
		checkoutObject = cartObject.clickcheckout();
				
	}
	
	@Test(priority = 5)
	@Description("check out overview page")
	public void checkout() {
		stepLog("enter first name");
		checkoutObject.enterFname("XYZ");
		
		stepLog("enter last name");
		checkoutObject.enterLname("ABC");
		
		stepLog("enter zip code");
		checkoutObject.enterZip("111111");
		
		stepLog("click continue");
		overviewObject = checkoutObject.clickcontinue();
	}
	
	@Test(priority = 6)
	@Description("finish overview")
	public void finish() {
		stepLog("click finish");
		completeObject = overviewObject.finish();
	}
	
	@Test(priority = 7)
	@Description("return to home screen")
	public void returntohome() {
		stepLog("return to homescreen");
		completeObject.clickfinish();
	}
}
