package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUtility {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://www.facebook.com");
		
		ScreenshotUtility s1 = new ScreenshotUtility(driver2);
		
		s1.capture("test");
	}
	
	public ScreenshotUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void capture(String str) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File( "D://Test//Gaurav1234" +str);
		
		FileUtils.copyFile(src, dest);
		
	}

}
