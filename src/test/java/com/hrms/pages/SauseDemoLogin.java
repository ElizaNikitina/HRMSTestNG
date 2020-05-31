package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class SauseDemoLogin  extends CommonMethods{

	
	@FindBy(id = "user-name")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath = "//input[@class='btn_action']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//div[text()='Products']")
	public WebElement productText;
	
	@FindBy(xpath = "//h3[contains(text(),'Epic sadface')]")
	public WebElement errorMessage;
	
	
	//www.saucedemo.com
	public SauseDemoLogin() {
		PageFactory.initElements(BaseClass.driver, this);

	}
	
	public void login(String userName, String passwd) {
		sendText(username, userName);
		sendText(password, passwd);
		click(loginBtn);
	}
	
	
}
