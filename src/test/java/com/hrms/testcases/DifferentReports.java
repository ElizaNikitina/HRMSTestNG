package com.hrms.testcases;

import org.testng.annotations.*;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class DifferentReports extends CommonMethods {

	@Test(priority = 1 , dataProvider = "reports creation")
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
				{ "Report One", "1", "display_field_9" }, 
				{ "Report Two", "2", "display_field_11" },
				{ "Report Three", "3", "display_field_10" } 
		};
		
		return data;
	}
	
}
