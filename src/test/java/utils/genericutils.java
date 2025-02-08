package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObject.offerpage;

public class genericutils {
	public WebDriver driver;
	
	public genericutils(WebDriver driver){
		this.driver=driver;
		
	}
	public void switchwindow() {
		
		Set<String> s1=driver.getWindowHandles();
	    Iterator<String> I1=s1.iterator();
		String parntwindow=I1.next();
	    String childwindow=I1.next();
	    driver.switchTo().window(childwindow);
		
	}
	
	
	
}
