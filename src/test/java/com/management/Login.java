package com.management;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.unique.Unique;

public class Login {
	
	
	public static By EMAIL_LOCATOR= By.id(("email"));
	public static By PASSWORD_LOCATOR= By.id(("password"));

	
	//for login button we used x path
	public static By SUBMITLOGIN_BUTTON_LOCATOR= By.id(("submitLoginBtn"));

	
	@Test (enabled=true)
	public void loginpage()throws InterruptedException
	{
	Thread.sleep(5000);
	Unique.driver.findElement(By.id("email")).sendKeys("ayeshazahid5896@gmail.com");
	Unique.driver.findElement(By.id("password")).sendKeys("3215");
	//Unique.driver.findElement(By.id("submitLoginBtn")).click();
	
	//login button

	
	//Unique.driver.findElement(By.xpath("button[ @data-qa='signup-button']")).click();
	}
	

@ Test (enabled=true)
	public void loginbutton()
	
	{	
	Unique.driver.findElement(By.id("submitLoginBtn")).click();

	 WebDriverWait wait = new WebDriverWait(Unique.driver,Duration.ofSeconds(15));
 
		 try {
	        
			 WebElement submitloginbtn = wait.until(ExpectedConditions.elementToBeClickable( (SUBMITLOGIN_BUTTON_LOCATOR))
					);
			 submitloginbtn.click();
		    

////			 
////		     // Print text for confirmation
		        System.out.println("click :" + submitloginbtn);
		    }
		 catch (Exception e) {
		        System.out.println("Unable to locate or click first submitloginbtn: " + e.getMessage());
		 }
		}
}

	

	
	
