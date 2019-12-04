package Utility;

import org.openqa.selenium.By;

public class Element
{
	
	public By locator(String LocatorType, String LocatorValue)
	{
		By locator = null;
		
		if(LocatorType.contentEquals("id"))
			locator = By.id(LocatorValue);
		
		if(LocatorType.contentEquals("name"))
			locator = By.name(LocatorValue);
		
		if(LocatorType.contentEquals("class"))
			locator = By.className(LocatorValue);
		
		if(LocatorType.contentEquals("linktext"))
			locator = By.linkText(LocatorValue);
		
		if(LocatorType.contentEquals("partial"))
			locator = By.partialLinkText(LocatorValue);
		
		if(LocatorType.contentEquals("tag"))
			locator = By.tagName(LocatorValue);
		
		if(LocatorType.contentEquals("xpath"))
			locator = By.xpath(LocatorValue);
		
		if(LocatorType.contentEquals("css"))
			locator = By.cssSelector(LocatorValue);
		
		return locator;
	}

}
