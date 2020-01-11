package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utility.Element;

public class RegisterPage
{
	static WebDriver driver;

	static Element element;
	
	static WebElement fname, lname, phone, email;
	
	static WebElement address1, address2, city, state, postal, country;
	
	static WebElement uname, password, confirm, submit;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		element = new Element();
	}
	
	public static void fname(String  locatorType, String locatorValue)
	{
		fname = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void lname(String  locatorType, String locatorValue)
	{
		lname = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void phone(String  locatorType, String locatorValue)
	{
		phone = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void eMail(String  locatorType, String locatorValue)
	{
		email = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	
	public static void address1(String  locatorType, String locatorValue)
	{
		address1 = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void address2(String  locatorType, String locatorValue)
	{
		address2 = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void city(String  locatorType, String locatorValue)
	{
		city = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	
	public static void state(String  locatorType, String locatorValue)
	{
		state = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void postalCode(String  locatorType, String locatorValue)
	{
		postal = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void country(String  locatorType, String locatorValue)
	{
		country = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void uname(String  locatorType, String locatorValue)
	{
		uname = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void password(String  locatorType, String locatorValue)
	{
		password = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void confirm(String  locatorType, String locatorValue)
	{
		confirm = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	public static void submit_butt(String  locatorType, String locatorValue)
	{
		submit = driver.findElement(element.locator(locatorType,locatorValue));
	}
	
	//actions for the elements identified
	public void fname_enterText(String  locatorType, String locatorValue, String text)
	{
		fname(locatorType, locatorValue);
		fname.sendKeys(text);
	}
	
	public void lname_enterText(String  locatorType, String locatorValue, String text)
	{
		lname(locatorType, locatorValue);
		lname.sendKeys(text);
	}
	
	public void phone_enterText(String  locatorType, String locatorValue, String text)
	{
		phone(locatorType, locatorValue);
		phone.sendKeys(text);
	}
	
	
	public void email_enterText(String  locatorType, String locatorValue, String text)
	{
		eMail(locatorType, locatorValue);
		email.sendKeys(text);
	}
	
	public void address1_enterText(String  locatorType, String locatorValue, String text)
	{
		address1(locatorType, locatorValue);
		address1.sendKeys(text);
	}
	
	public void address2_enterText(String  locatorType, String locatorValue, String text)
	{
		address2(locatorType, locatorValue);
		address2.sendKeys(text);
	}
	
	public void city_enterText(String  locatorType, String locatorValue, String text)
	{
		city(locatorType, locatorValue);
		city.sendKeys(text);
	}
	
	public void state_enterText(String  locatorType, String locatorValue, String text)
	{
		state(locatorType, locatorValue);
		state.sendKeys(text);
	}

	
	public void postal_enterText(String  locatorType, String locatorValue, String text)
	{
		postalCode(locatorType, locatorValue);
		postal.sendKeys(text);
	}

	public void country_enterText(String  locatorType, String locatorValue, String selectValue)
	{
		country(locatorType, locatorValue);
		
		Select s = new Select(country);
		s.selectByVisibleText(selectValue);
	}
	
	public void uname_enterText(String  locatorType, String locatorValue, String text)
	{
		uname(locatorType, locatorValue);
		uname.sendKeys(text);
	}
	
	public void password_enterText(String  locatorType, String locatorValue, String text)
	{
		password(locatorType, locatorValue);
		password.sendKeys(text);
	}
	
	
	public void confirm_enterText(String  locatorType, String locatorValue, String text)
	{
		confirm(locatorType, locatorValue);
		confirm.sendKeys(text);
	}
	
	
	public void submit_Click(String  locatorType, String locatorValue)
	{
		submit_butt(locatorType, locatorValue);
		submit.click();
	}
	
	
}
