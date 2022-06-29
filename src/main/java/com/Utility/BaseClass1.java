package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
