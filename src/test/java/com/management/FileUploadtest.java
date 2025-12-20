package com.management;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.unique.Unique;

public class FileUploadtest {
	
	@Test (enabled = true)

	public void  LOCATOR() {
 Unique.driver.findElement(Locators.CHECKBOX_LOCATOR).click();
 Unique.driver.findElement(Locators.CHOOSEFILE_LOCATOR).sendKeys("a");
 Unique.driver.findElement(Locators.UPLOAD_LOCATOR).click();

	
	
}
	
@Test (enabled=true)
public void CHECKBOX() {

    WebDriverWait wait = new WebDriverWait(Unique.driver, Duration.ofSeconds(15));

    try {
        // Click on CHECKBOX
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Locators.CHECKBOX_LOCATOR)
        );
        checkbox.click();

        
        System.out.println(" value: " + checkbox);

    } catch (Exception e) {
        System.out.println("Unable to locate element: " + e.getMessage());
    }

    //FILE CHOOSE


try {
    
    WebElement choosefile= wait.until(
            ExpectedConditions.elementToBeClickable(Locators.CHOOSEFILE_LOCATOR)
    );
    choosefile.sendKeys("aa");

    
    System.out.println("File Uploaded Sucessfully");

} catch (Exception e) {
    System.out.println("Unable to locate file: " + e.getMessage());
}

try {
    // Click on UPLOAD LOCATOR
    WebElement upload_file = wait.until(
            ExpectedConditions.elementToBeClickable(Locators.UPLOAD_LOCATOR)
    );
    upload_file.click();

    
    System.out.println(" value: " + upload_file);

} catch (Exception e) {
    System.out.println("Unable to locate element: " + e.getMessage());
}

}
}



