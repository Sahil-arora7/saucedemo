package main.utilities;

	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class CoreActions {
	    protected final WebDriver bot;
	    protected final WebDriverWait waiter;


	    protected CoreActions(WebDriver bot) {
	        this.bot = bot;
	        this.waiter = new WebDriverWait(bot, 10);
	    }

	    protected boolean waitForVisibility(By element) {
	        boolean isVisible = true;
	        try {
	            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
	        } catch (TimeoutException te) {
	            isVisible = false;
	        }
	        return isVisible;
	    }

	    protected void click(By element) {
	        System.out.println("Clicking element");
	        bot.findElement(element).click();
	    }

	    protected void enterText(By element, String text) {
	        bot.findElement(element).sendKeys(text);
	    }   

	    protected void clearText(By element) {
	        bot.findElement(element).clear();
	    }   

	    protected String pageTitle() {return bot.getTitle(); }

	    protected boolean present(By element) {
	        if(bot.findElement(element)!=null){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }

	    protected String textRetriever(By element){
	        return bot.findElement(element).getText();
	    }
}
