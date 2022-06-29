package com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeMethod
	public void BM(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();	
		}
		else if(Browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();	
		}
		
		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();
		
	}

	
}
