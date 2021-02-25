package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void getExcel() {
		excelFileName="CreateLead1";

	}
	
	@Test(dataProvider="fetchdata")
	public void runCreateLead(String cName, String fName, String lName) throws IOException {
		new LoginPage(driver,prop)
		.enterUserName()
		.enterPassword()
		.addScreenshot()
		.clickLogin()
		.addScreenshot()
		.clickCrmsfaLink()
		.clickLeads()
		.clickCreateLeads()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.addScreenshot()
		.clickCreateLeadButton()
		.viewPage().
		addScreenshot().
		getLeadID();

	}
}
