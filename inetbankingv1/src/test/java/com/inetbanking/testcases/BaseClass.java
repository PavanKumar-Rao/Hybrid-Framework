package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	
	
	/*
	public String baseURL = "http://demo.guru99.com/v4/";
	public String username = "mngr230779";
	public String password = "ybEbEbY";
	public static Logger logger;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver");
		driver = new ChromeDriver();

		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}*/
	
	 ReadConfig readconfig = new ReadConfig();
	
	
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getpassword();

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
