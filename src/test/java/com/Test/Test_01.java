package com.Test;

import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AngelOne;
import com.Utility.BaseClass;
import com.Utility.BaseClass1;
import com.Utility.Library;

public class Test_01 extends BaseClass1{
	
	
	pass_id a=new pass_id();
	public void scroollby(String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+value+")", "");
		//js.executeScript("window.scrollBy(0,1000)", "");
	//System.out.println("window.scrollBy(0,"+value+")", "");
	}

	public void screenshot(String name) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
	
		File destn=new File("C:\\Users\\HP\\eclipse-workspace\\JLS_FRAMEWORK\\Screenshot\\"+name+".png");
		FileHandler.copy(src, destn);
		//System.out.println("C:\\Users\\HP\\eclipse-workspace\\JLS_FRAMEWORK\\Screenshot\\.png");
	}



	@Test
	public void first() throws Exception {
		Test_01 screen=new Test_01();
		
		
		AngelOne ele=PageFactory.initElements(driver, AngelOne.class);
		
		ele.getTxt_UserID().sendKeys(a.getId());
		Thread.sleep(2000);
		ele.getTxt_Pass().sendKeys(a.getPassword());
		Thread.sleep(2000);
		ele.getBtn_Login().click();
		Thread.sleep(2000);
		ele.getBtn_Cancel().click();
		Thread.sleep(2000);
		ele.getTab_dashboard().click();
		Thread.sleep(7000);
		screen.screenshot("Ankush");
		Thread.sleep(2000);
		ele.getTab_Markets().click();
		Thread.sleep(7000);
		screen.scroollby("500");
		Thread.sleep(2000);
		try {ele.getTab_orders().click();}
		catch(Exception l) {System.out.println(l);}
		Thread.sleep(7000);
		screen.screenshot("one");
		screen.scroollby("500");
		Thread.sleep(2000);
		ele.getTab_Funds().click();
		Thread.sleep(7000);
		screen.screenshot("Second");
		Thread.sleep(2000);
		ele.getTab_Reports().click();
		Thread.sleep(7000);
		screen.screenshot("Third");
		Thread.sleep(2000);
		ele.getTab_More().click();
		Thread.sleep(7000);
		screen.screenshot("five");
		Thread.sleep(2000);
		try {ele.getTab_Advisory().click();}
		catch(Exception e) {System.out.println(e);}
		ele.getTab_Portfolio().click();
		Thread.sleep(5000);
		ele.getDrp_Setting().click();
		Thread.sleep(5000);
		ele.getBtn_Logout().click();;
		screen.screenshot("Fourth");
		
		
		
		
	}
	

}
