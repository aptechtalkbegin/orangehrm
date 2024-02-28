package com.qa.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	public WebDriver driver; // here public is not defined in pavan's code

	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
