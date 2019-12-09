package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.TopMenu;

public class TopMenuVerify 
{

	@Test
	public void TopMeu_Verify()
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
