package com.management;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.unique.Unique;

public class Registration2 {
	
	public static By FIRST_NAME_LOCATOR=By.id("firstName");
	public static By LAST_NAME_LOCATOR=By.id("lastName");
	public static By PHONE_NUMBER_LOCATOR=By.id("phone");
	public static By COUNTRY_NAME_LOCATOR=By.id("countries_dropdown_menu");
	public static By EMAIL_ADDRESS_LOCATOR=By.id("emailAddress");
	public static By PASSWORD_NAME_LOCATOR=By.id("password");
	public static By REGISTER_BUTTON_LOCATOR=By.id("registerBtn");
	
	@Test (enabled=false)
	
public void form() throws InterruptedException
    { 
		// registration form filling with driver.find element
		
		Thread.sleep(1000);
	Unique.driver.findElement(By.id("firstName")).sendKeys("aisha");
	Unique.driver.findElement(By.id("lastName")).sendKeys("zahid");
	Unique.driver.findElement(By.id("phone")).sendKeys("0123");
	Unique.driver.findElement(By.id("countries_dropdown_menu")).sendKeys("Pakistan");
	Unique.driver.findElement(By.id("emailAddress")).sendKeys("ayeshazahid5896@gmail.com");
	Unique.driver.findElement(By.id("password")).sendKeys("3245");
	Unique.driver.findElement(By.id("registerBtn")).click();

     }


@Test
public void Registrationform()
{
	//for firstname 
	WebDriverWait wait = new WebDriverWait(Unique.driver,Duration.ofSeconds(10));
try {
	
	WebElement FIRST_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(FIRST_NAME_LOCATOR));
	if (FIRST_NAME_FIELD.isDisplayed() && FIRST_NAME_FIELD.isEnabled() ) {
		FIRST_NAME_FIELD.clear();
		FIRST_NAME_FIELD.sendKeys("AISHA");
		
	}
	else {
		System.out.println("Unable to find firstname locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find firstname locator");
}
	
	
//for last name

try {
	
	WebElement LAST_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(LAST_NAME_LOCATOR));
	if (LAST_NAME_FIELD.isDisplayed() && LAST_NAME_FIELD.isEnabled() ) {
		LAST_NAME_FIELD.clear();
		LAST_NAME_FIELD.sendKeys("ZAHID");
		
	}
	else {
		System.out.println("Unable to find lastname locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find lastname locator");
}
	
//for phone
try {
	
	WebElement PHONE_NUMBER_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(PHONE_NUMBER_LOCATOR));
	if (PHONE_NUMBER_FIELD.isDisplayed() && PHONE_NUMBER_FIELD.isEnabled() ) {
		PHONE_NUMBER_FIELD.clear();
		PHONE_NUMBER_FIELD.sendKeys("0309");
		
	}
	else {
		System.out.println("Unable to find phone number locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find phone number locator");
}
	
	// for country 
try {
	
	WebElement COUNTRY_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(COUNTRY_NAME_LOCATOR));
	if (COUNTRY_NAME_FIELD.isDisplayed() && COUNTRY_NAME_FIELD.isEnabled() ) {
		Select COUNTRY_DROPDOWN = new Select(COUNTRY_NAME_FIELD);
        COUNTRY_DROPDOWN.selectByValue("Pakistan");
		
	}
	else {
		System.out.println("Unable to find country name locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find country name locator");
}
	//for emailaddress
try {
	
	WebElement EMAIL_ADDRESS_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(EMAIL_ADDRESS_LOCATOR));
	if (EMAIL_ADDRESS_FIELD.isDisplayed() && EMAIL_ADDRESS_FIELD.isEnabled() ) {
		EMAIL_ADDRESS_FIELD.clear();
		EMAIL_ADDRESS_FIELD.sendKeys("aisha4568");
		
	}
	else {
		System.out.println("Unable to find email address locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find email addresslocator");
}
	
	// for password
try {
	
	WebElement PASSWORD_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(PASSWORD_NAME_LOCATOR));
	if (PASSWORD_NAME_FIELD.isDisplayed() && PASSWORD_NAME_FIELD.isEnabled() ) {
		PASSWORD_NAME_FIELD.clear();
		PASSWORD_NAME_FIELD.sendKeys("3321");
		
	}
	else {
		System.out.println("Unable to find password name locator");
	}
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Unable to find password name locator");
}
	
	//for register button  
try {
	
	WebElement REGISTER_BUTTON_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(REGISTER_BUTTON_LOCATOR));
	 REGISTER_BUTTON_FIELD .click();
	    

//// 
//// // Print text for confirmation
    System.out.println("click :" + REGISTER_BUTTON_FIELD );
}
catch (Exception e) {
    System.out.println("Unable to locate or click first submitloginbtn: " + e.getMessage());
}
	


	
}	
}	






