package com.qa.testBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver; //here no static is mentioned in pavan's code
	
	
	@BeforeMethod
	public void setup()
	{
		
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		//options.addArguments("--remote-allow-origins=*");

		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
