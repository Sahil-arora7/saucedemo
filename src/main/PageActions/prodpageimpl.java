package main.PageActions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.ProductPage;
import main.utilities.CoreActions;

public class prodpageimpl extends CoreActions {

	protected prodpageimpl(WebDriver bot) {
		super(bot);
		// TODO Auto-generated constructor stub
	}

	@Step("adding name and price before adding into cart")
	public void getnamebefore() {
		ProductPage.prodname = textRetriever(ProductPage.ProductName);
		ProductPage.prodprice = textRetriever(ProductPage.ProductPrice);
	}
	
	
	@Step("Clicking on the Add to cart button")
    public void clickAddCart() {
        click(ProductPage.Addtocart);

    }
	
	@Step("Click on cart")
	public cartImpl clickcart() {
		click(ProductPage.Cartbutton);
		return new cartImpl(bot);
	}
	
}
