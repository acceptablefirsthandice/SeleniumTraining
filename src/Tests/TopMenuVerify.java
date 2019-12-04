package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.TopMenu;

public class TopMenuVerify 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		TopMenu TMO = new TopMenu(driver);
		
		TMO.signOn_click();
		
		TMO.register_click();
		
		TMO.support_click();
		
		TMO.contact_click();
		

	}

}
