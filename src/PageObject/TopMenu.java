package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Element;

/* This page level classes are used to represent page web elements and associated 
 * actions which could be reused as necessary in our test using the object of these classes
 * ---Lankesh 2/12/2019
 */

public class TopMenu
{
	//Following elements are available in top menu across the application
	//Sign-On,	Register,	Support,	Contact
	
	// WebElement xyz = driver.findELment(By.id("locatorvalue");
	// driver ==> representing the page where element is available
	// By.id ==> locator type of the webelement
	// locatorvalue ==> associate property value

	
	//driver --> is used to represent the test case browser with in the class
	static WebDriver driver;
	
	//local webelement variables for loading the page elements.
	static WebElement signOn, register, support, contact;
	
	static Element element;
	
	//d --> is the actual browser representation from the test case
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
		element = new Element();
	}
	
	
	
	//identification of sign-on webelement on the top menu
	public static void signOn_link(String LocatorType, String LocatorValue)
	{
		signOn = driver.findElement(element.locator(LocatorType, LocatorValue));
	}
	
	//identification of Register webelement on top menu
	public static void register_link(String LocatorType, String LocatorValue)
	{
		register = driver.findElement(element.locator(LocatorType, LocatorValue));
	}
	
	//identification of Support webelement on top menu
		public static void support_link(String LocatorType, String LocatorValue)
		{
			support = driver.findElement(element.locator(LocatorType, LocatorValue));
		}
	

		//identification of Support webelement on top menu
		public static void contact_link(String LocatorType, String LocatorValue)
		{
			contact = driver.findElement(element.locator(LocatorType, LocatorValue));
		}
		
	//SignOn action
	public void signOn_click()
	{
		signOn_link("linktext", "SIGN-ON");
		signOn.click();
	}
	
	//register action
	public void register_click()
	{
		register_link("linktext", "REGISTER");
		register.click();
	}
	
	//support action
	public void support_click()
	{
		support_link("linktext", "SUPPORT");
		support.click();
	}
	
	//contact action
	public void contact_click()
	{
		contact_link("linktext", "CONTACT");
		contact.click();
	}
		
		
	
	
	
	
}