package com.unique;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Unique {
	public static WebDriver driver;
	public static Logger logs = LogManager.getLogger(Unique.class);
	
	@Test
	
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
     	



}
}