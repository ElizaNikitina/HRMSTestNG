package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods{

		@FindBy(id = "welcome")
		public WebElement welcome;
		
		@FindBy(xpath = "//div[@id='branding']/a[1]/img")
		public WebElement logo;
		
		@FindBy(id = "firstName")
		public WebElement firstName;
		
		@FindBy(id = "lastName")
		public WebElement lastName;
		
		@FindBy(xpath = "//li[@class='line nameContainer']//label")
		public WebElement fullName;
		
		@FindBy(xpath = "//label[text()='Employee Id']")
		public WebElement empID;
		
		@FindBy(xpath = "//label[text()='Photograph']")
		public WebElement photo;
		
		public DashBoardPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(id = "menu_pim_viewPimModule")
		public WebElement pim;
		
		@FindBy(id = "menu_pim_addEmployee")
		public WebElement pimAddEmp;
	


		@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
		public WebElement addEmp;
		
		@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
		public WebElement PIM;

		
		
		public void navigateToAddEmployee() {
			jsClick(PIM);
			jsClick(addEmp);
		}
	
		
		@FindBy(xpath = "//*[@id=\"photofile\"]")
		public WebElement photofile;
		
		
		@FindBy(id = "btnSave")
		public WebElement btnSave;
		
		//pim 
		public void addEmp() {
			jsClick(pim);
			jsClick(pimAddEmp);
		}
	}

