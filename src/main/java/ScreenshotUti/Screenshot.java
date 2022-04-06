package ScreenshotUti;

import java.io.File; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Baselibrary.Base;

public class Screenshot extends Base
{

	public static void get_screenshot(String filename, String foldername)
	{
		try {

			String fileLoc = System.getProperty("user.dir");
			String filepath = fileLoc + "\\Screenshot\\" + foldername + "\\" + filename + ".jpeg";
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(filepath));

		}

		catch (Exception e) {

			System.out.println(e);
		}
    }

}