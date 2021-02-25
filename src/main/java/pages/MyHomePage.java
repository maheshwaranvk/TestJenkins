package pages;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElementByXPath(prop.getProperty("MyLeadsPage.CreateLead.Xpath")).click();
		
		return new MyLeadsPage(driver,prop);

	}
}
