package main.PageActions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.CheckOutComplete;
import main.utilities.CoreActions;

public class completeimpl extends CoreActions {

	protected completeimpl(WebDriver bot) {
		super(bot);
		// TODO Auto-generated constructor stub
	}

	@Step("back to home page")
	public void clickfinish() {
		click(CheckOutComplete.backToHomebtn);
	}
}
