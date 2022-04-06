package Pages;


import java.util.List;  
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Baselibrary.Base;
import ExcelUtility.ExcelRead;

public class Login extends Base
{
	
	String Path="C:\\Users\\sagar.mehra.IN2ITTECH\\eclipse-workspace\\DemoTest\\ExcelRead\\data.xlsx";
	public Login()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@placeholder='Email Address']")
	private WebElement Username;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//*[@class='btn btn-login btn-block btn-lg']")
	private WebElement Signmein;
	
	@FindBy(xpath="//*[@id='content']/cats-tracker-marker-clustering/div[1]/div/div[5]/select")
	private WebElement seldep;
	
	@FindBy(xpath="//*[@id='global-criteria-filter']")
	private WebElement sel;
	
	@FindBy(xpath="(//*[@class='checkmark'])[4]")
	private WebElement sellocatn;
	
	@FindBy(xpath="//*[@value='LocationWise']")
	private WebElement location;
	
	@FindBy(xpath="//*[@id='global-user-filter']")
	private WebElement selusers;
	
	@FindBy(xpath="(//*[@class='checkmark'])[8]")
	private WebElement users;
	
	
	@FindBy(xpath="//*[@value=\"Go\"]")
	private WebElement Applfilter;
	
	@FindBy(xpath="//*[@id='reportrange']")
	private WebElement dateclick;
	
	@FindBy(xpath="//*[@data-range-key='Yesterday']")
	private WebElement yesrtrdy;
	
	@FindBy(xpath="//*[@class='checkmark']")
	private WebElement selectall;
	
	@FindBy(xpath="(//*[@class='fas fa-chart-line fa-sm'])[1]")
	private WebElement Activity;
	
	@FindBy(xpath="(//*[@class='amcharts-amexport-icon amcharts-amexport-icon-level-0 amcharts-amexport-item-blank'])[1]")
	private WebElement Appicationreport;
	
	@FindBy(xpath="(//*[@class='amcharts-amexport-item amcharts-amexport-item-level-1 amcharts-amexport-item-blank'])[1]")
	private WebElement Image;
	
	@FindBy(xpath="(//*[@class='amcharts-amexport-item amcharts-amexport-item-level-2 amcharts-amexport-item-png'])[1]")
	private WebElement png;
	
	public void Signme()
	{
		try 
		{
			System.out.println("launching the browser");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String actual="CATS Prowatch";
			String expected=driver.getTitle();
			
			System.out.println("Actual Title   : "+actual);
			System.out.println("Expected Title : "+expected);
			
			Username.sendKeys("sagar.mehra");
			Thread.sleep(2000);
			Password.sendKeys("Test@123");
			Thread.sleep(2000);
			Signmein.click();
//			if(actual.equals(expected))
//			{
//				System.out.println("Result: PASS");
//			}
//			else
//			{
//				System.out.println("Result: FAIL");
//			}
//		    softassertion.assertEquals(actual,expected);
//            
//            
//            String status=ExcelRead.GetData(Path, 1, 0);
//            //System.out.println(status);
//            if(status.contains("YES"))
//            {
//            	Username.sendKeys(ExcelRead.GetData(Path, 1, 1));
//            	Thread.sleep(2000);
//            	Password.sendKeys(ExcelRead.GetData(Path, 1, 2));
//            	Thread.sleep(2000);
//            	Signmein.click();
//
//            }
//            
	
		}
	
		catch (Exception e) 
			{
				System.out.println("issue in Signme method"+e);
			}
		}
	
		
	 public void VerifyHomeURL()
		{
		
		try {
		      	WebDriverWait wait = new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Home']")));
				String actualUrl="http://100.100.10.83:8080/#/dashboard/home";
				String expectedUrl=driver.getCurrentUrl();
				System.out.println("Expected URL : "+expectedUrl);
				System.out.println("Actual URL   : "+actualUrl);
				if(actualUrl.equals(expectedUrl))
				{
					System.out.println("Result: PASS");
				}
				else
				{
					System.out.println("Result: FAIL");
				}
			    softassertion.assertEquals(actualUrl,expectedUrl);
		}
		catch (Exception e) 
		{
			System.out.println("Issue in VerifyHomeURL method"+e);
		}

	} 
		
	 public void select()
		{
			try 
			{
				seldep.click();
				Thread.sleep(3000);
				location.click();
				Thread.sleep(3000);
				sel.click();
				Thread.sleep(2000);
				sellocatn.click();
				Thread.sleep(2000);
				selusers.click();
				Thread.sleep(2000);
				users.click();
				Thread.sleep(2000);
				Applfilter.click();
				Thread.sleep(3000);
				
				
			} 
			catch (Exception e) 
			{
				System.out.println("issue in select method"+e);
			}
			
				
		}
	
	 public void DateFilterValidation()
		{
			try 
			{
				dateclick.click();
				Thread.sleep(2000);
				//yesrtrdy.click();
				//Thread.sleep(2000);
			     int i=0;
				List<WebElement> list=driver.findElements(By.xpath("//*[@class='ranges']//ul//li"));
				for(WebElement ab:list)
				{
					String value=ab.getText();
					i++;
					if(i==3) {
					
						if(value.equalsIgnoreCase("Yesterday"))
						{
							System.out.println("Yesterday is present");
						}
						else {System.out.println("not matched");}
					
					}
				}
				
				
			} 
			catch (Exception e) 
			{
				System.out.println("issue in select method"+e);
			}
			
				
		}
	
//
//	 public void ActivityPerformance()
//		{
//			try 
//			{
//				Activity.click();
//				Thread.sleep(3000);
//				Appicationreport.click();
//				Thread.sleep(3000);
//				Image.click();
//		        Thread.sleep(3000);
//	            png.click();

//				
//				
//			} 
//			catch (Exception e) 
//			{
//				System.out.println("issue in select method"+e);
//			}
//			
//				
//		}

	 
	 
	 
}

