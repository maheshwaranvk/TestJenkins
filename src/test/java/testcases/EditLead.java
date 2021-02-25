package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{

	@Test
	public void runEditLead() throws InterruptedException, IOException {
		new LoginPage(driver,prop)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLead()
		.enterLeadID(leadID)
		.clickFindLeads()
		.clickLeadID()
		.clickEdit()
		.updateCompaName()
		.clickUpdateButton()
		.addScreenshot();
		

	}
}
