package com.management;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.unique.Unique;

public class Registration2 {
	
	public static By FIRST_NAME_LOCATOR=By.id("firstName");
	public static By LAST_NAME_LOCATOR=By.id("lastName");
	public static By PHONE_NUMBER_LOCATOR=By.id("phone");
	public static By COUNTRY_NAME_LOCATOR=By.id("countries_dropdown_menu");
	public static By EMAIL_ADDRESS_LOCATOR=By.id("emailAddress");
	public static By PASSWORD_LOCATOR=By.id("password");
	public static By REGISTER_BUTTON_LOCATOR=By.id("registerBtn");

	public static Logger logs = LogManager.getLogger(Registration2.class);

	
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


@Test (enabled=true)
public void Registrationform()
{
	//for firstname 
	

	WebDriverWait wait = new WebDriverWait(Unique.driver,Duration.ofSeconds(10));
	
try {
   
	logs.info("Waiting for First Name field");

	WebElement FIRST_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(FIRST_NAME_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        FIRST_NAME_FIELD   );
	        
	if (FIRST_NAME_FIELD.isDisplayed() && FIRST_NAME_FIELD.isEnabled() ) {
        logs.info("First Name field found and enabled");

		FIRST_NAME_FIELD.clear();
		Unique.loggers.log(Status.INFO, "First Name: clear the first name field");

		FIRST_NAME_FIELD.sendKeys("AISHA");
		 js.executeScript("arguments[0].style.border=''", FIRST_NAME_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on first name fields succesfully");
        logs.info(" Sucessfully Entered First Name");
		Unique.loggers.log(Status.PASS, "First Name: Enter the Text Successfully");

	}
	else {
        logs.warn("First Name field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate first name field");

	}
} catch (NoSuchElementException e) {
	// TODO: handle exception
    logs.error("First Name field not found", e);
}
  catch (Exception  e) {
	logs.fatal("😌 Unexpected error occurred on First Name field. " + e.getMessage());

}

	
//for last name

try {
	
    logs.info("Waiting for Last Name field");

	WebElement LAST_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(LAST_NAME_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        LAST_NAME_FIELD   );
	   
	
	if (LAST_NAME_FIELD.isDisplayed() && LAST_NAME_FIELD.isEnabled() ) {
        logs.info("Last Name field found and enabled");

		LAST_NAME_FIELD.clear();
		Unique.loggers.log(Status.INFO, "Last Name: clear the last name field");

		LAST_NAME_FIELD.sendKeys("ZAHID");
		js.executeScript("arguments[0].style.border=''", LAST_NAME_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on last name fields succesfully");
        logs.info(" Sucessfully Entered Last Name");

	}
	else {
        logs.warn("Last Name field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate first name field");

	}
	
	
} catch (Exception e) {
	// TODO: handle exception
    logs.error("Last Name field not found", e);
}
	
//for phone
try {
    logs.info("Waiting for PHONE_NUMBER field");

	WebElement PHONE_NUMBER_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(PHONE_NUMBER_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        PHONE_NUMBER_FIELD   );
	
	if (PHONE_NUMBER_FIELD.isDisplayed() && PHONE_NUMBER_FIELD.isEnabled() ) {
        logs.info("PHONE_NUMBER field found and enabled");

		PHONE_NUMBER_FIELD.clear();
		Unique.loggers.log(Status.INFO, "Phone Number: clear the phone number field");

		PHONE_NUMBER_FIELD.sendKeys("0309");
		js.executeScript("arguments[0].style.border=''", PHONE_NUMBER_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on phone number fields succesfully");
        logs.info("Sucessfully entered PHONE_NUMBER");

	}
	else {
        logs.warn("PHONE_NUMBER field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate  phone number field");

	}
	
	
} catch (Exception e) {
	// TODO: handle exception
    logs.error("PHONE_NUMBER field not found", e);
}
	
	// for country 
try {
    logs.info("Waiting for Country Name field");

	WebElement COUNTRY_NAME_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(COUNTRY_NAME_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        COUNTRY_NAME_FIELD   );
	
	
	
	if (COUNTRY_NAME_FIELD.isDisplayed() && COUNTRY_NAME_FIELD.isEnabled() ) {
        logs.info("Country  Name field found and enabled");

		Select COUNTRY_DROPDOWN = new Select(COUNTRY_NAME_FIELD);
		Unique.loggers.log(Status.INFO, "Country Name: clear the Country name field");

        COUNTRY_DROPDOWN.selectByValue("Pakistan");
        js.executeScript("arguments[0].style.border=''",COUNTRY_NAME_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on country name fields succesfully");
        logs.info(" Sucessfully entered Country  Name");

	}
	else {
        logs.warn("Country  Name field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate country name field");

	}
	
	
} catch (Exception e) {
	// TODO: handle exception
    logs.error("Country  Name field not found", e);
}
	//for emailaddress
try {
    logs.info("Waiting for Email Address field");

	WebElement EMAIL_ADDRESS_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(EMAIL_ADDRESS_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        EMAIL_ADDRESS_FIELD   );
	
	
	if (EMAIL_ADDRESS_FIELD.isDisplayed() && EMAIL_ADDRESS_FIELD.isEnabled() ) {
        logs.info("Email Address field found and enabled");

		EMAIL_ADDRESS_FIELD.clear();
		Unique.loggers.log(Status.INFO, "Email address: clear the  email address field");

		EMAIL_ADDRESS_FIELD.sendKeys("ayesha5896@gmail.com");
		js.executeScript("arguments[0].style.border=''", EMAIL_ADDRESS_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on email fields succesfully");
        logs.info("Sucessfully  Entered Email Address");

	}
	else {
        logs.warn("Email Address field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate email address field");

	}
	
	
} catch (Exception e) {
	// TODO: handle exception
    logs.error("Email Address field not found", e);
}
	
	// for password
try {
    logs.info("Waiting for Password field");

	WebElement PASSWORD_FIELD = wait.until(ExpectedConditions.presenceOfElementLocated(PASSWORD_LOCATOR));
	 JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
	    js.executeScript(
	        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
	        PASSWORD_FIELD   );
	
	if (PASSWORD_FIELD.isDisplayed() && PASSWORD_FIELD.isEnabled() ) {
        logs.info(" Password  field found and enabled");

		PASSWORD_FIELD.clear();
		Unique.loggers.log(Status.INFO, "Password Field: clear the password field");

		PASSWORD_FIELD.sendKeys("3321");
		js.executeScript("arguments[0].style.border=''", PASSWORD_FIELD); 
		Unique.loggers.log(Status.INFO, "Enter a text on password name fields succesfully");
        logs.info(" Sucessfully Entered  Password ");

	}
	else {
        logs.warn(" Password  field is present but not visible or not enabled");
		Unique.loggers.log(Status.FAIL, "Unable to locate password name field");

	}
	
	
} catch (Exception e) {
	// TODO: handle exception
    logs.error(" Password  field not found", e);
}
	
	//for register button  
try {
    logs.info("Waiting for Register button");

    WebElement registerButton =
        wait.until(ExpectedConditions.elementToBeClickable(REGISTER_BUTTON_LOCATOR));
    JavascriptExecutor js = (JavascriptExecutor)Unique.driver;
    js.executeScript(
        "arguments[0].style.boxShadow='0 0 10px 3px linear-gradient(to right, #FFC512, #FF5733)';",
        registerButton   );
    logs.info("Register button found and clickable");

    registerButton.click();

    logs.info("Register button clicked successfully");

} catch (Exception e) {
    logs.error("Register button not found or not clickable", e);
}
	


	
}	
}	






