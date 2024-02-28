package com.qa.testCases;

import org.testng.Assert;
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
		logger.debug("######## Application Logs ########");
		logger.info("######## Test Execution Started ########");
		try {
		//LoginPage loginPage= new LoginPage(driver);
		
		logger.info("######## Login to Orangehrm Application  ########");
		loginPage= new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnSubmit();
		
		System.out.println("Login is successful");
		}
		catch(Exception e)
		{
		  logger.error("Test Failed");
		  Assert.fail();	
		}	
		logger.info("######## Login to Orangehrm Application is successful ########");
		
	}
	
	@Test(priority=2)
	void test1()
	{
		Assert.assertEquals(1,1);
	}
	
	@Test(priority=3)
	void test2()
	{
		Assert.assertEquals("A","B");
	}
	
	@Test(priority=4, dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals(1, 1);
	}

}


