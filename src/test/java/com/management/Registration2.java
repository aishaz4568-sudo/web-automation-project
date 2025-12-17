package com.management;

import java.time.Duration;

import org.openqa.selenium.By;
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
	
	@Test
	
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



//public void Registrationform()
//{
//	WebDriverWait wait = new WebDriverWait(Unique.driver,Duration.ofSeconds(10));
//
//	
//	
}



