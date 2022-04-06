package Baselibrary;

import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import ScreenshotUti.Screenshot;



public class Base 
{
	public static SoftAssert softassertion=new SoftAssert();
	public static WebDriver driver=null;
	
	public static void getlaunch(String url) 
	{
	
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	@AfterMethod
	public  void get_listeners(ITestResult result) 
	{

		String methodname = result.getMethod().getMethodName();

		try {
			if (result.isSuccess()) {
				Screenshot.get_screenshot(methodname, "passed");
			}

			else if (result.getStatus() == ITestResult.FAILURE) {
				Screenshot.get_screenshot(methodname, "faild");

			}

			else if (result.getStatus() == ITestResult.SKIP) {
				Screenshot.get_screenshot(methodname, "skip");
			}

		}

		catch (Exception e) {
			System.out.println("get screenshot" + e);

		}
	}

	
}
