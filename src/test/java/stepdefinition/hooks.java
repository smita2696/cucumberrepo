package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testcontext;


public class hooks {
	testcontext testcontext1;
	
	public hooks(testcontext testcontext) {
		this.testcontext1=testcontext;
	}
	
	
	@After
	public void afterscenario() throws IOException
	{
		testcontext1.testbase1.webdrivermanager().quit();
	}
	
	@AfterStep
	public void addscreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver=testcontext1.testbase1.webdrivermanager();
		if(scenario.isFailed()) {
			
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
	
}
