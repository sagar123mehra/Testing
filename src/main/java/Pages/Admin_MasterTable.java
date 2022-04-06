package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baselibrary.Base;

public class Admin_MasterTable extends Base
{
	public Admin_MasterTable()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"style-4\"]/li[9]")
	private WebElement AdminMT;
	
	@FindBy(xpath="(//*[@class='btn btn-primary btn-sm ng-star-inserted'])[1]")
	private WebElement UpdateApplication;
	
	@FindBy(xpath="//*[@id='global-deptApp-filter']")
	private WebElement Selectapplication;
	
	@FindBy(xpath="(//*[@class='checkmark'])[5]")
	private WebElement App;
	
	@FindBy(xpath="(//*[@class='btn btn-primary btn-block'])[2]")
	private WebElement Savebutton;
	
	
	public void Admin()
	{
		try 
		{
			System.out.println("Open the AdminMasterPage");
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='panel-body ng-star-inserted'])[1]")));
			System.out.println("Update the application  ");
            AdminMT.click();
            Thread.sleep(5000);
            UpdateApplication.click();
            Thread.sleep(4000);
            Selectapplication.click();
            Thread.sleep(2000);
            App.click();
            Thread.sleep(2000);
            Savebutton.click();
            
			
		}
	
		catch (Exception e) 
			{
				System.out.println("issue in Admin method"+e);
			}
		}
	
}
