package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;


public class LoginTest extends CommonMethods {
	
	@Test(groups="smoke")
	public void validAdminLogin() {
		test.info("Entering valid admin credentilas");
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		// DashboardPageElements dashboard = new DashboardPageElements();
		test.info("Verifying valid username shows with welcome text");
		String expectedUser = "Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
	}

	@Test(groups="regression")
	public void invalidPasswordLogin() {
		// LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "qwe");
		click(login.loginBtn);

		String expected = "Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	@Test(groups="regression")
	public void emptyUsernameLogin() {
		// LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		String expected = "Username cannot be empty";

		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

}