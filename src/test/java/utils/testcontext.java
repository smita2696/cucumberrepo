package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import pageObject.pageobjectmanager;
public class testcontext{
	
	public WebDriver driver;
	public String productname;
	public pageobjectmanager pageobjectmanager;
	public testbase testbase1;
	public genericutils genericutils1;
	
	public testcontext() throws IOException {
		testbase1=new testbase();
		pageobjectmanager=new pageobjectmanager(testbase1.webdrivermanager());
		genericutils1=new genericutils(testbase1.driver);
		
	}
	
	

}
