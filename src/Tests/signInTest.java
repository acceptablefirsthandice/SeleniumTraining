package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.TopMenu;
import PageObject.SignInPage;

public class signInTest
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
	public void signIn_Test() 
	{
		// test for login scenario
		tp.signOn_click();
		sp.userName_enterText("name", "userName","Lankesh123@gmail.com");
		sp.password_enterText("name", "password","Lankesh123");
		sp.sign_Click("name", "login");
	}

}