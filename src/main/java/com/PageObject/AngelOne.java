package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AngelOne {
	
	@FindBy(how=How.XPATH,using="//input[@id='txtUserID']")
	private WebElement txt_UserID;

	@FindBy(how=How.XPATH,using="//input[@id='txtTradingPassword']")
	private WebElement txt_Pass;

	@FindBy(how=How.XPATH,using="//a[@id='loginBtn']")
	private WebElement btn_Login;
	
	
	@FindBy(how=How.XPATH,using="(//button[@class='close icon-cancel'])[6]")
	private WebElement btn_Cancel;

	@FindBy(how=How.XPATH,using="//a[@id='mnDashboard']")
	private WebElement tab_dashboard;

	@FindBy(how=How.XPATH,using="//a[@id='mnMarkets']")
	private WebElement tab_Markets;
	

	@FindBy(how=How.XPATH,using="//a[@id='mnOrders']")
	private WebElement tab_orders;

	@FindBy(how=How.XPATH,using="//a[@id='mnAdvisory']")
	private WebElement tab_Advisory;

	@FindBy(how=How.XPATH,using="//a[@id='mnReports']")
	private WebElement tab_Reports;
	

	@FindBy(how=How.XPATH,using="//a[@id='mnFunds']")
	private WebElement tab_Funds;

	@FindBy(how=How.XPATH,using="//a[@id='mnMore']")
	private WebElement tab_More;

	@FindBy(how=How.XPATH,using="//a[@id='mnPort']")
	private WebElement tab_Portfolio;
	@FindBy(how=How.XPATH,using="(//a[@class='dropdown-toggle'])[10]")
	private WebElement drp_Setting;

	@FindBy(how=How.XPATH,using="//a[@onclick='SignOut()']")
	private WebElement btn_Logout;

	public WebElement getTxt_UserID() {
		return txt_UserID;
	}

	public WebElement getTxt_Pass() {
		return txt_Pass;
	}

	public WebElement getBtn_Login() {
		return btn_Login;
	}

	public WebElement getBtn_Cancel() {
		return btn_Cancel;
	}

	public WebElement getTab_dashboard() {
		return tab_dashboard;
	}

	public WebElement getTab_Markets() {
		return tab_Markets;
	}

	public WebElement getTab_orders() {
		return tab_orders;
	}

	public WebElement getTab_Advisory() {
		return tab_Advisory;
	}

	public WebElement getTab_Reports() {
		return tab_Reports;
	}

	public WebElement getTab_Funds() {
		return tab_Funds;
	}

	public WebElement getTab_More() {
		return tab_More;
	}

	public WebElement getTab_Portfolio() {
		return tab_Portfolio;
	}

	public WebElement getDrp_Setting() {
		return drp_Setting;
	}

	public WebElement getBtn_Logout() {
		return btn_Logout;
	}

}