package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits
{
	
	/*public static void main(String[] args) throws InterruptedException
	{
		Waits wt = new Waits();
		
		WebDriver driver = new ChromeDriver();
		wt.pageWait(driver, 5);
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		wt.scrptWait(driver, 1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("alert('Hello');");
		
		wt.sleep(5000);
		
		String str = "PresenceofElement";
		By locator = By.id("username");
		wt.expWait(driver, 1, locator, str);
		driver.findElement(By.id("username")).sendKeys("lankesh");
		
		locator = By.id("password");
		wt.flWait(driver, 1, str, locator);
		driver.findElement(By.id("password")).sendKeys("lankesh123");
	}*/
	

	//Thread sleep method used to pause the execution
	public void sleep(int milli) throws InterruptedException
	{
		Thread.sleep(milli);
	}
	
	//pageload time out used for setting the page load time
	public void pageWait(WebDriver driver, int timeinSec)
	{
		driver.manage().timeouts().pageLoadTimeout(timeinSec, TimeUnit.SECONDS);
	}
	
	//script time out
	public void scrptWait(WebDriver driver, int timeinSec)
	{
		driver.manage().timeouts().setScriptTimeout(timeinSec, TimeUnit.SECONDS);
	}
	
	//Implicit wait
	public void impWait(WebDriver driver, int timeinSec)
	{
		driver.manage().timeouts().implicitlyWait(timeinSec, TimeUnit.SECONDS);
	}

	//Explicit Wait
	public void expWait(WebDriver driver, int timeinSec, By locator, String str)
	{
		WebDriverWait wt = new WebDriverWait(driver, timeinSec);
		if(str.equals("PresenceofElement"))
			wt.until(ExpectedConditions.presenceOfElementLocated(locator));
		if(str.equals("alertispresent"))
			wt.until(ExpectedConditions.alertIsPresent());
	}
	
	//Fluent Wait
	public void flWait(WebDriver driver, int timeinSec, String str, By locator)
	{
		FluentWait ft = new FluentWait(driver).pollingEvery(2, TimeUnit.SECONDS);
		if(str.equals("PresenceofElement"))
			ft.until(ExpectedConditions.presenceOfElementLocated(locator));
		if(str.equals("alertispresent"))
			ft.until(ExpectedConditions.alertIsPresent());
	}
	
}



