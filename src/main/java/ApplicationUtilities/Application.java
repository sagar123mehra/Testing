package ApplicationUtilities;

import java.util.ArrayList;    

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Baselibrary.Base;

public class Application extends Base
{
static Actions act;



	
	public static void ScrollByxpath(WebElement ele)
	{
		try
		{
			
		JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ele);
		} catch (Exception e) 
		{
			System.out.println("Issue in ScrollByxpath method");
		}
	}
	
	public static void Doubleclick(WebElement ele)
	{
	
		try
		{
     	act= new Actions(driver);
	    act.doubleClick(ele).build().perform();

	   } catch (Exception e)
	  {
	  System.out.println("Issue in Doubleclick method "+e);
	  }
    }

	public static void Rightclick(WebElement ele)
	{
	   try
	  {
	  act=new Actions(driver);
	  act.contextClick(ele).build().perform();

	  } catch (Exception e)
	 {
	 System.out.println("Issue in RIght click method "+e);
	 }
	}


	public static void Changewindow(int index)
	{
	try
	{
	ArrayList<String>tab= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tab.get(index));

	} catch (Exception e)
	{
	System.out.println("Issue in ChangeWindow method "+e);
	}
	}
	
	public static void SelectDropdown(WebElement ele,String value)
	  {
		  try 
		  {
			Select sel=new Select(ele);
			sel.selectByValue(value);
			
			
		  }
		  catch (Exception e) 
		  {
			  System.out.println("SelectDropdown");
		  }
	  }

	  public static void dragAndDropBy(WebElement slider)
		{
		   try
		  {
		  act=new Actions(driver);
		  act.dragAndDropBy(slider,50,0).perform();

		  } catch (Exception e)
		 {
		 System.out.println("Issue in Slider method "+e);
		 }
		}

}
