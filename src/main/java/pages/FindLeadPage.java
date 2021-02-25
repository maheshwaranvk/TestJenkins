package pages;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {

	public FindLeadPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;

	}
	
	public FindLeadPage enterLeadID(String leadID) 
		
		{
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(leadID);
		return this;
		
		}
	
	
	
	public FindLeadPage clickFindLeads() throws InterruptedException {
		
		driver.findElementByXPath(prop.getProperty("FindLeads.FindLeadsButton.xpath")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage clickLeadID() 
		
		{
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a").click();
		return new ViewLeadPage(driver,prop);
	}
	
}
