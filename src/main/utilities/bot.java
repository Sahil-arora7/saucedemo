package main.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bot {

	private final WebDriver driver;

    //Constructor to initialize driver with ChromeDriver
    public bot() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.arora\\eclipse-workspace\\sauceDemo\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    //Returning driver whenever required
    public WebDriver getbot(){
        return driver;
    }
}
