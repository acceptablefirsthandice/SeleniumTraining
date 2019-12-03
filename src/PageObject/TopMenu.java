package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	
	//d --> is the actual browser representation from the test case
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	//identification of sign-on webelement on the top menu
	public static void signOn_link(String LocatorType, String LocatorValue)
	{
		signOn = driver.findElement(locator(LocatorType, LocatorValue));
	}
	
	//identification of Register webelement on top menu
	public static void register_link(String LocatorType, String LocatorValue)
	{
		register = driver.findElement(locator(LocatorType, LocatorValue));
	}
	
	//identification of Support webelement on top menu
		public static void support_link(String LocatorType, String LocatorValue)
		{
			support = driver.findElement(locator(LocatorType, LocatorValue));
		}
	

		//identification of Support webelement on top menu
		public static void contact_link(String LocatorType, String LocatorValue)
		{
			contact = driver.findElement(locator(LocatorType, LocatorValue));
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
		
		
	
	public static By locator(String LocatorType, String LocatorValue)
	{
		By locator;
		switch(LocatorType)
		{
		case "id":
			locator = By.id(LocatorValue);
			break;
		case "name":
			locator = By.name(LocatorValue);
			break;
		case "tagname":
			locator = By.tagName(LocatorValue);
			break;
		case "class":
			locator = By.className(LocatorValue);
			break;
		case "linktext":
			locator = By.linkText(LocatorValue);
			break;
		case "partial":
			locator = By.partialLinkText(LocatorValue);
			break;
		case "xpath":
			locator = By.xpath(LocatorValue);
			break;
		case "csspath":
			locator = By.cssSelector(LocatorValue);
			break;
		default:
			return null;
			
		}
		return locator;
	}
	
	
}