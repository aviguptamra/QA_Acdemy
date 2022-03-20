package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	FileInputStream fis;
	
	public TestBase()
	{
		
		try {
			 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties");
			//Here we remove hardcode path instead of this replace with System.getProperty("user.dir") is ponited to project
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static  void  Initilization()
	{
	      if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	      {
	    	  File Chromedriver=new File("C:\\Users\\Avi Gupta\\eclipse-workspace\\QA_Academy.com\\src\\main\\resources\\Chromedriver\\chromedriver.exe");
	    	  System.setProperty("webdriver.chrome.driver", Chromedriver.getAbsolutePath());
	    	  driver= new ChromeDriver();
	    	  
	      }
	      else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	      {
	    	  File Firefoxdriver=new File("C:\\Users\\Avi Gupta\\eclipse-workspace\\QA_Academy.com\\src\\main\\resources\\Firefox\\geckodriver.exe");
	    	  System.setProperty("webdriver.gecko.driver", Firefoxdriver.getAbsolutePath());
	    	  driver=new FirefoxDriver();
	      }
	      
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}


	
	

}
