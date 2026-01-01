package com.unique;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Unique {
	public static WebDriver driver;
	public static Logger logs = LogManager.getLogger(Unique.class);
	public static ExtentReports extent;
	public static ExtentTest loggers;
	
	@BeforeSuite
	

	
	public void browse()
	{

		driver = new ChromeDriver();
		logs.info("Launching a chrome browsers");
		logs.info("Application started");
        logs.warn("Warning message");
        logs.error("Test Faileur");

		driver.manage().window().maximize();
//		driver.get("https://automationteststore.com/index.php?rt=product/special");
     	//driver.get("https://qa-practice.razvanvancea.ro/auth_ecommerce.html");
     	driver.get("https://qa-practice.razvanvancea.ro/register.html");
     //	driver.get("https://the-internet.herokuapp.com/checkboxes");
     	//driver.get("https://the-internet.herokuapp.com/upload");
     	
     	
     // reporting code
    	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/output/index.html");
    	spark.config().setDocumentTitle("Automation Report");
    	spark.config().setReportName("AISHA ZAHID");
    	extent = new ExtentReports();
    	extent.attachReporter(spark);
    	extent.setSystemInfo("Reporter: ", "AISHA");
    	extent.setSystemInfo("Environment: ", "QA");
    	
    	loggers=extent.createTest("configuration");
    	loggers.log(Status.INFO,"initializng configuration file");
	}   	
    @AfterSuite
   
    public void EntReport(){
    	extent.flush();
    	
}
	}
