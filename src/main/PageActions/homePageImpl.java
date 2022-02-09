package main.PageActions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.HomePage;
import main.utilities.CoreActions;

public class homePageImpl extends CoreActions {

	public homePageImpl(WebDriver bot) {
		super(bot);
	}

	@Step("Verify that correct site is opened")
	public void verifySite() {
		Assert.assertEquals("Swag Labs",pageTitle());
	}
	
	@Step("Enter username")
	public void enterUserName() {
		String s = textRetriever(HomePage.usernameoptions);
		String[] x = s.split("\n");
		enterText(HomePage.username , x[1]);
	}
	
	public void enterPassword() {
		String s = textRetriever(HomePage.passoption);
		String[] x = s.split("\n");
		enterText(HomePage.password , x[1]);
	}
	
	@Step("Clicking on login button")
    public prodpageimpl login(){
        click(HomePage.login);
		return new prodpageimpl(bot);
    }
}
