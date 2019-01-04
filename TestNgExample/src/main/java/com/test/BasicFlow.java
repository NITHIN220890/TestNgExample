package com.test;




import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFlow {
	
	static String chrome = "C:\\Users\\Nitin\\Desktop\\chromedriver.exe";

	static WebDriver driver;
	
	
	@BeforeMethod
	public void browserinvoke() {
		
		System.setProperty("webdriver.chrome.driver",chrome);
		
	   driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		}
	
	
	
	@Test
	
	public void Amazonloaunch() {
		
		driver.navigate().to("https://www.amazon.in/");
		
	}
	
	@Test
      public void flipkart() {
		
		driver.navigate().to("https://www.flipkart.com/");
		
	}
	
	
	
	@Test
    public void myntra() {
		
		driver.navigate().to("https://www.myntra.com/");
		
	}
	
	
	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
	}
	
  
}




