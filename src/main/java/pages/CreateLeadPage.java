package pages;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElementById(prop.getProperty("CreateLeadPage.FirstName.Id")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElementById(prop.getProperty("CreateLeadPage.LastName.Id")).sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompName(String cName) {
		driver.findElementById(prop.getProperty("CreateLeadPage.CompanyName.Id")).sendKeys(cName);
		return this;

	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElementByName(prop.getProperty("CreateLeadPage.SubmitButton.Name")).click();
		return new ViewLeadPage(driver,prop);

	}
	
	public CreateLeadPage addScreenshot() throws IOException {
		addScreenshot("Create Lead Page Loaded Successfully");
		return this;
	}
}
