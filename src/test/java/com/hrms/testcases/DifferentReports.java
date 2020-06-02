package com.hrms.testcases;

import org.testng.annotations.*;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class DifferentReports extends CommonMethods {

	@Test(dataProvider = "reports creation")
	public void createReports(String repName, String selectCreteria, String dispFields) {
		
		test.info("Entering valid admin credentilas");
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(2);
	
		dashboard.navigateToReports();
		
		reports.btnAdd.click();
		
		wait(2);
		
		test.info("create different type of reports");
		sendText(reports.reportName,repName);
		selectDdValue(reports.selectedCriteria, selectCreteria);
		selectDdValue(reports.displayFields, dispFields);
		wait(2);
		
		reports.btnAddDispField.click();
		
		reports.btnCheckBox.click();
		
		reports.btnSave.click(); 
		
		wait(2);
		
	}
	
	@DataProvider(name = "reports creation")
	public Object[][] getData() {
		Object[][] data = { 
				{ "Report One", "Past Employees Only", "Employee Last Name" }, 
//				{ "Report Two", "Current and Past Employees", "Employee First Name" },
//				{ "Report Three", "Current Employees Only", "Employee Middle Name" } ,
//				{ "Report Four", "Past Employees Only", "Employee Middle Name" }, 
//				{ "Report Five", "Current and Past Employees", "Nationality" },
//				{ "Report Six", "Current Employees Only", "Driver License Number" } 
		};
		
		return data;
	}
	
}
