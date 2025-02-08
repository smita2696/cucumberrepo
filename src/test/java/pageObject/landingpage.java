package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.testcontext;

public class landingpage {
	WebDriver driver;
	
	public landingpage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String getproductname()
	{
		return driver.findElement(productname).getText();
		
	}
	

}
