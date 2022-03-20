package PagesTestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.PracticePage;
import TestBase.TestBase;
import utils.CustomListener;
import utils.TestUtils;

//@Listeners(CustomListener.class)
public class PracticePageTestCase extends TestBase {  
	//PracticePageTestCase class is extend or inherited the TestBase class or TestBase class property(Methods, varibles i.e webdriver driver)
	
	ExtentReports extent;
	PracticePage pp;
	TestUtils ts;
	SoftAssert sa;
	
	
	public PracticePageTestCase() throws IOException
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initilization();
		pp=new PracticePage();
		ts=new TestUtils();
		sa=new SoftAssert();
		
	}
	
	
	@Test(priority = 1)
	public void ClickOnRadiobutton1()
	{
		pp.Radiobutton1();
		//driver.findElement(pp.user);
		/*1.If webelement(webobject is a public then you can access in testcase class)
		  2.If webelement(webobject is a private then you cannot access in testcase class so, that is called achive to Encapsulation)
		*/
		System.out.println("SDET-2");
		
		
		System.out.println("SDET-3");
	}
	
	@Test(priority = 2)
	public void SuggessionClassExample()
	{
		pp.SuggessionClassExample(prop.getProperty("Sendkeys"));
	}
	
	@Test (priority = 3)
	public void Dropdown()
	{
		pp.Dropdown(prop.getProperty("DropdownValue"));
	}
	
	
	@Test(priority = 4)
	public void Checkbox1()
	{
		pp.Checkbox1();
	}
	
	@Test (priority = 5)
	public void WindowHandling()
	{
		ts.WindowHandling();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
