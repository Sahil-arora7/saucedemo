package test.basic;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import main.utilities.bot;

public class baseclass {

	protected WebDriver bot;
	protected static final String URL = "https://www.saucedemo.com";

    @BeforeClass
    public void openBrowser() {
        bot = new bot().getbot();
        bot.get(URL);
    }

    protected static void stepLog(String step) {   //To print steps
        logger.step(step);
    }
    
    @AfterClass
    public void closeBrowser() {
    	bot.quit();
    }
    
    
}
