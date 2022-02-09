package main.PageActions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.checkoutinfo;
import main.utilities.CoreActions;

public class checkoutimpl extends CoreActions {

	protected checkoutimpl(WebDriver bot) {
		super(bot);
		// TODO Auto-generated constructor stub
	}

	@Step("enter first name")
	public void enterFname(String fname) {
		enterText(checkoutinfo.First_name,fname);
	}
	
	@Step("enter last name")
	public void enterLname(String lname) {
		enterText(checkoutinfo.Last_name,lname);
	}
	
	@Step("enter zip")
	public void enterZip(String zip) {
		enterText(checkoutinfo.zip_code,zip);
	}
	
	@Step("click continue")
	public overviewimpl clickcontinue() {
		click(checkoutinfo.continue_button);
		return new overviewimpl(bot);
	}
}
