package com.unique;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Unique {
	public static WebDriver driver;
@Test
	public void browser() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https://automationteststore.com/index.php?rt=product/special");
     	//driver.get("https://qa-practice.razvanvancea.ro/auth_ecommerce.html");
     	driver.get("https://qa-practice.razvanvancea.ro/register.html");


}
}