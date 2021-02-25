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

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver driver,Properties prop) {
		
		this.driver=driver;
		this.prop=prop;
	}
	
	public LoginPage enterUserName() {
		driver.findElementById(prop.getProperty("LoginPage.Username.ID")).sendKeys(prop.getProperty("username"));
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById(prop.getProperty("LoginPage.Password.ID")).sendKeys(prop.getProperty("password"));
		return this;

	}
	
	public CrmsfaPage clickLogin() {
		driver.findElementByClassName(prop.getProperty("LoginPage.LoginButton.ClassName")).click();
		return new CrmsfaPage(driver,prop);

	}
	
	public LoginPage addScreenshot() throws IOException {
	addScreenshot("LoginPage Loaded Successfully");
		return this;
	}
	
}
