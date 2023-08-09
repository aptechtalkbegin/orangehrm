package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.pageObjects.LoginPage;
import com.qa.testBase.TestBase;

public class Test_Login_Page extends TestBase{
	
	//Here the below line of code was written inside the testLoginPage method
	//LoginPage loginPage= new LoginPage(driver);
	
	public static LoginPage loginPage;
	@Test
	public void testLoginPage()
	{
		//LoginPage loginPage= new LoginPage(driver);
		loginPage= new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnSubmit();
		
		System.out.println("Login is successful");
	}

}
