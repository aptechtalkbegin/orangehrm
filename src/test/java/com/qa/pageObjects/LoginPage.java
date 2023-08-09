package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.basePage.PageBase;

public class LoginPage extends PageBase{
	
	public static WebDriver driver;
	
	public LoginPage( WebDriver driver)
	
	{
		
		super(driver);
	}

	
	//WebElements
	
	@FindBy (xpath="//input[@name='username']")
	WebElement txt_username_loc;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement txt_password_loc;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement btn_submit_loc;
	
	@FindBy (xpath ="//h6[normalize-space()='Dashboard']")
	WebElement lbl_dashboard_loc;
	
	// Action methods
	
	
	public void enterUsername(String username)
	{
		txt_username_loc.sendKeys(username);
		
	}
	
	public void enterPassword(String password)
	
	{
		txt_password_loc.sendKeys(password);
		
	}
	
	public void clickOnSubmit()
	
	{
		btn_submit_loc.click();
	}
	
	public String displayDashboard()
	{
		try {
		return lbl_dashboard_loc.getText();
		}
		catch (Exception e)
		{
			return (e.getMessage());
		}
	}
		
}
