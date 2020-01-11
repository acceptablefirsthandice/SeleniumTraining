package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener
{

	public void onFinish(ITestContext context)
	{
		System.out.println("get suite name " + context.getSuite());
		System.out.println("get all test methods " + context.getAllTestMethods());
		
		System.out.println("Iam triggered when all the tests are finished");
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Iam triggered when all the tests are started");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Iam triggered when a particular test is failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Iam triggered when a particular test is skipped");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("start mills " + result.getStartMillis());
		System.out.println("Iam triggered when a particular test is started");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("End mills " + result.getEndMillis());
		System.out.println("Test name" + result.getTestName());
		
		System.out.println("Iam triggered when a particular test is success");
		
	}
	
	
}
