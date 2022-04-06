package extent_report;

import com.aventstack.extentreports.ExtentReports; 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager
{

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	public static ExtentTest logger;
	
	
	public static ExtentReports gerReports()
	{
		if(extent==null)
		{
			extent=new ExtentReports();
			System.out.println(System.getProperty("user.dir"));
			extent=new ExtentReports();
			spark=new ExtentSparkReporter(System.getProperty("user.dir")+"\\ExtentReport\\");
			spark.config().setReportName("CatsDashboard");
			spark.config().setDocumentTitle("Cats Testing Extent Report");
			spark.config().setTheme(Theme.DARK);
			extent.attachReporter(spark);
		
		}			
         return extent;
	}
	
}
