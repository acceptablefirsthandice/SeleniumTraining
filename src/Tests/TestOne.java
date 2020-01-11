package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Waits;

@Listeners(Utility.ListenerUtility.class)
public class TestOne {
	
	@Test(priority = 0, enabled = true, groups = {"Regression"})
	public void TC_001() throws InterruptedException
	{
		Waits wt = new Waits();
		
		WebDriver driver = new ChromeDriver();
		wt.pageWait(driver, 5);
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		wt.scrptWait(driver, 1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("alert('Hello');");
		driver.switchTo().alert().accept();
		
		wt.sleep(5000);
		
		String str = "PresenceofElement";
		By locator = By.id("username");
		wt.expWait(driver, 1, locator, str);
		driver.findElement(By.id("username")).sendKeys("lankesh");
		
		locator = By.id("password");
		wt.flWait(driver, 1, str, locator);
		driver.findElement(By.id("password")).sendKeys("lankesh123");
		System.out.println("TestOne in TestOne NG class");
	}

	
	@Test(priority=2, enabled = false, groups = {"Regression"})
	public void TC_002()
	{
		System.out.println("TestTwo in TestOne NG class");
	}
	
	
	@Test(priority=1, enabled = true,groups = {"Smoke"})
	public void TC_003()
	{
		System.out.println("TestThree in TestOne NG class");
		Assert.fail();
	}
}
