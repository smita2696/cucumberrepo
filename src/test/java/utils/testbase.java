package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testbase {
	public WebDriver driver;
	 public EdgeDriver edgeDriver;
	
	public WebDriver webdrivermanager() throws IOException{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resource//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		String browser_prop=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browser=browser_maven!=null?browser_maven:browser_prop;
		System.out.print(browser_maven);
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resource//chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//src//test//resource//msedgedriver.exe");
				driver=new EdgeDriver();
				driver.get(url);
			}
		}
		return driver;
	}
}
