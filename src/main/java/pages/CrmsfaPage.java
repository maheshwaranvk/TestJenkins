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

public class CrmsfaPage extends ProjectSpecificMethods{

	public CrmsfaPage(RemoteWebDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	public MyHomePage clickCrmsfaLink() {
	
		driver.findElementByLinkText(prop.getProperty("HomePage.CRMSFA.linktext")).click();
		return new MyHomePage(driver,prop);
		
	}
	
	public CrmsfaPage addScreenshot() throws IOException {
		addScreenshot("CRMSFA Page Loaded Successfully");
		return this;
	}
}
