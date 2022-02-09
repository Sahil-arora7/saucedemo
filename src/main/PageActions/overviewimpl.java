package main.PageActions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import main.pages.CheckOutOverview;
import main.utilities.CoreActions;

public class overviewimpl extends CoreActions {

	protected overviewimpl(WebDriver bot) {
		super(bot);
		// TODO Auto-generated constructor stub
	}

	@Step("click finish")
	public completeimpl finish() {
		click(CheckOutOverview.finish_button);
		return new completeimpl(bot);
	}
}
