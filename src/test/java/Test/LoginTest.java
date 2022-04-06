package Test;


import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Baselibrary.Base;
import Pages.Login;
import extent_report.ExtentReportManager;

public class LoginTest extends Base
{
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;

	
	
	
	
    Login ob=null;
	
	@BeforeTest
	public void getlaunch() 
	{
		
		try 
		{
			getlaunch("http://100.100.10.83:8080/#/auth/login");
			ob=new Login();
			extent=ExtentReportManager.gerReports();
			test=extent.createTest("Testing for login tab");
			extent.attachReporter(spark);
			
		
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getlaunch method"+e);
		}
	}
	
	
	
	@Test(priority=0,enabled=true)
	public void getsignin()
	{
		try 
		{
			ob.Signme();
			test.log(Status.INFO, "sign in");
		} 
		catch (Exception e)
		{
			System.out.println("Issue in getsignin method"+e);
		}
	}
	

	@Test(priority=1,enabled=true)
	public void getAssert()
	{
		try 
		{
			ob.VerifyHomeURL();
			test.log(Status.INFO, "get Assert");

		} 
		catch (Exception e)
		{
			System.out.println("Issue in getAssert method"+e);
		}
	}
	
	@Test(priority=2,enabled=true)

	public void getselect()
	{
		try 
		{
			ob.select();
			test.log(Status.INFO, " get select");

		} 
		catch (Exception e)
		{
			System.out.println("Issue in getselect method"+e);
		}
	}
	
	@Test(priority=3,enabled=true)

	public void getDateFilterValidation()
	{
		try 
		{
			ob.DateFilterValidation();
			test.log(Status.INFO, " date filter validation");

		} 
		catch (Exception e)
		{
			System.out.println("Issue in getDateFilterValidation method"+e);
		}
	}
	
	@AfterMethod
	public void Finish()
	{
		extent.flush();
	}

	
	//@Test(priority=4)

//	public void getActivityPerformance()
//	{
//		try 
//		{
//			ob.ActivityPerformance();
//		} 
//		catch (Exception e)
//		{
//			System.out.println("Issue in getActivityPerformance method"+e);
//		}
//	}
	

}
