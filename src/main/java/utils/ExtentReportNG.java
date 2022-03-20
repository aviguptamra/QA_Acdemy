package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	
	public  static ExtentReports getreportobject()
	{
		String path=System.getProperty(("user.dir")+"\\reports\\index.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Page Object Model Reports");
		reporter.config().setDocumentTitle("test report");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TesterInfo", "Avi Gupta - QA");
		
		return extent;
	}

}
