package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Baselibrary.Base;
import Pages.Admin_MasterTable;
import extent_report.ExtentReportManager; 
public class Admin_MasterTableTest extends Base
{
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;


	Admin_MasterTable ob= null;
	  
	  @Test(priority=0)
		public void getAdmin()
		{
			try 
			{
				ob=new Admin_MasterTable();
				ob.Admin();
				extent=ExtentReportManager.gerReports();
				test=extent.createTest("Testing for Admin_MasterTable tab");
				extent.attachReporter(spark);
				test.log(Status.INFO, "Admin_MasterTable");

			} 
			catch (Exception e)
			{
				System.out.println("Issue in getAdmin method"+e);
			}
		}
	
	  @AfterMethod
		public void Finish()
		{
			extent.flush();
		}
}
