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

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,Properties prop) {
		this.driver = driver;
		this.prop=prop;
	}

	public ViewLeadPage viewPage() {
		System.out.println("LeadCreated");
		return this;

	}
	
	public MyLeadsPage clickDelete() throws InterruptedException {
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		return new MyLeadsPage(driver,prop);

	}
	
	public EditLeadPage clickEdit() {
		driver.findElementByXPath(prop.getProperty("ViewLead.EditButton.xpath")).click();
		return new EditLeadPage(driver,prop);
	}
	
	public void getLeadID() {
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		leadID = text.replaceAll("\\D", "");
		System.out.println(leadID);
			}
	
	public ViewLeadPage addScreenshot() throws IOException {
		addScreenshot("View Lead Page Loaded Successfully");
		return this;
	}
}
