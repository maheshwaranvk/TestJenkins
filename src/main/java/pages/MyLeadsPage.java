package pages;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(RemoteWebDriver driver, Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}

	public CreateLeadPage clickCreateLeads() {
		driver.findElementByXPath(prop.getProperty("MyLeadsPage.CreateLead.Xpath")).click();
		
		return new CreateLeadPage(driver,prop);

	}
	
	public FindLeadPage clickFindLead() {
		driver.findElementByXPath(prop.getProperty("MyLeads.FindLead.xpath")).click();
		
		return new FindLeadPage(driver,prop);

	}
	
}
