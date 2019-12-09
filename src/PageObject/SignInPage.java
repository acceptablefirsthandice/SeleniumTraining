package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Element;

public class SignInPage
{
	static WebDriver driver;
	static Element element;
	
	static WebElement userName, password, signIN;
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		element = new Element();
	}
	
//username object
	
	public static void username(String LocatorType, String LocatorValue)
	{
		userName = driver.findElement(element.locator(LocatorType, LocatorValue));
	}
	
	public static void password(String LocatorType,String LocatorValue)
	{
		password = driver.findElement(element.locator(LocatorType, LocatorValue));
	}
	
	public static void signIN(String LocatorType,String LocatorValue)
	{
		signIN = driver.findElement(element.locator(LocatorType, LocatorValue));
	}
	
	
	public void userName_enterText(String LocatorType,String LocatorValue,String text)
	{
		username(LocatorType,LocatorValue);
		userName.sendKeys(text);
	}
	
	public void password_enterText(String LocatorType,String LocatorValue,String text)
	{
		password(LocatorType,LocatorValue);
		password.sendKeys(text);
	}
	
	public void sign_Click(String LocatorType,String LocatorValue)
	{
		signIN(LocatorType,LocatorValue);
		signIN.click();
	}
}
