package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ReportsPagesElements;
import com.hrms.pages.SauseDemoLogin;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ReportsPagesElements reports;
	
	
	public static SauseDemoLogin sauseDemoLogin;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashBoardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		reports = new ReportsPagesElements();
		sauseDemoLogin = new SauseDemoLogin();
	}
}