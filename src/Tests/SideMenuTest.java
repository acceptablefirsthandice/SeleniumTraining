package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.SideMenu;
import PageObject.SignInPage;
import PageObject.TopMenu;

public class SideMenuTest 
{
	static WebDriver driver;
	static SignInPage sp;
	static TopMenu tp;
	
	@BeforeClass
	public void beforeClass() 
	{
		  driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		  sp = new SignInPage(driver);
		  tp = new TopMenu(driver);
	}

	@Test
	public void sideMenu_Verify()
	{
		SideMenu spo = new SideMenu(driver);
		
		spo.home_click();
		spo.flights_click();
		spo.home_click();
		spo.cal_click();
		spo.home_click();
		spo.flights_click();
		spo.home_click();
		spo.cruises_click();
		spo.home_click();
		spo.vacation_click();
		spo.home_click();
	}
}
