package pages;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public EditLeadPage updateCompaName() {
		driver.findElementById(prop.getProperty("EditLead.UpdateCompName.Id")).sendKeys("Wirpo");
		return this;

	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElementByName(prop.getProperty("EditLead.UpdateButton.Name")).click();
		return new ViewLeadPage(driver, prop);

	}
}
