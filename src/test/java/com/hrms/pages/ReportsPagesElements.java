package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class ReportsPagesElements extends CommonMethods {
	@FindBy(xpath = "//input[@value='Add']")
	public WebElement btnAdd;

	@FindBy(id = "report_report_name")
	public WebElement reportName;

	@FindBy(id = "report_include_comparision")
	public WebElement selectedCriteria;

	@FindBy(id = "report_include_comparision")
	public WebElement displayFields;

	@FindBy(id = "btnSave")
	public WebElement btnSave;

	@FindBy(id = "btnAddDisplayField")
	public WebElement btnAddDispField;

	@FindBy(id = "display_group_1")
	public WebElement btnCheckBox;

	@FindBy(id = "tableWrapper")
	public WebElement table;

	public ReportsPagesElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void login() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		// test.info("Click PIM and then click Reports");
		click(dashboard.pim);
		click(dashboard.report);

	}

	public void checkAddedReports() {
		List<WebElement> rows = driver.findElements(By.id("tableWrapper"));

		for (WebElement newRow : rows) {
			String newInfo = newRow.getText();
			if (newInfo.contains("Report One") && newInfo.contains("Report Two") && newInfo.contains("Report Three")) {
				takeScreenshot(newRow.getText());
			} else {
				System.out.println("Test case failed");
			}
		}
	}
	
	
	/*
	 * @Test(priority = 2) public void checkAddedReports() {
	 * sendText(login.username, ConfigsReader.getProperty("username"));
	 * sendText(login.password, ConfigsReader.getProperty("password"));
	 * click(login.loginBtn); wait(2);
	 * 
	 * dashboard.navigateToReports();
	 * 
	 * reports.checkAddedReports();
	 * 
	 * 
	 * }
	 */
}
