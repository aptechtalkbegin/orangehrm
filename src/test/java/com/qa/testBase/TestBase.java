package com.qa.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver; // here no static is mentioned in pavan's code
	public static Logger logger;
	public static Properties prop;
	public static FileInputStream fis;

	// @BeforeClass
	@BeforeMethod
//	@Parameters("browser") // this is used for parallel cross browser testing using testng.xml file
//	public void setup(String br) throws IOException {
		public void setup() throws IOException {
		// ChromeOptions options=new ChromeOptions();
		// options.setExperimentalOption("excludeSwitches",new String[]
		// {"enable-automation"});
		// options.addArguments("--remote-allow-origins=*");

		// Log4j2

		logger = LogManager.getLogger(this.getClass()); // for logging of current class which is being executed

		// Reading properties file from the config.properties file
		prop = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\Priji\\eclipse-workspace\\orangehrm\\src\\test\\resources\\config.properties");
		prop.load(fis);

//		if (br.equals("Chrome")) {
//			driver = new ChromeDriver();
//
//		} else if (br.equals("Firefox")) {
//			driver = new FirefoxDriver();
//		} else {
//			driver = new EdgeDriver();
//		}

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	// @AfterClass
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}

	public String randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}

	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);

		return (st + "@" + num);
	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}

}
