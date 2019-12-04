package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.RegisterPage;
import PageObject.TopMenu;

public class RegistrationTests {
	
	static WebDriver driver;
	static TopMenu tpo;
	static RegisterPage rpo; 

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		tpo = new TopMenu(driver);
		rpo = new RegisterPage(driver);
		//click on register in the home page
		tpo.register_click();
		
		//adding registration fields in registration page
		rpo.fname_enterText("name", "firstName", "Larry");
		rpo.lname_enterText("name", "lastName","Page");
		rpo.phone_enterText("name", "phone","99999999");
		rpo.email_enterText("id", "userName","Larry");
		
		rpo.address1_enterText("name", "address1","Block-5");
		rpo.address2_enterText("name", "address2","Street taiwan");
		rpo.city_enterText("name", "city","New York");
		rpo.state_enterText("name", "state","New York");
		rpo.postal_enterText("name", "postalCode","50423");
		rpo.country_enterText("name", "country", "ZAMBIA");
		
		rpo.uname_enterText("id", "email","larry@gmail.com");
		rpo.password_enterText("name", "password","larry123");
		rpo.confirm_enterText("name", "confirmPassword","larry123");
		
		rpo.submit_Click("name", "register");
		
		
	}

}
