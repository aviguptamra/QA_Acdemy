package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.TestBase;

public class CustomListener extends TestBase implements ITestListener {  
	//Here we are inherited the ITestListener interface with the help of implements keywords and declare ITestListener interface unimplemented methods. 
	
	public void onTestFailure(ITestResult result)
	{
		takesscreenshot(result.getMethod().getMethodName());
	}
	
	
	
	public void takesscreenshot(String ScreenCastName)
	
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./FailureScreenCast/"+ScreenCastName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
