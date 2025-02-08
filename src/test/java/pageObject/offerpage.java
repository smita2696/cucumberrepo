package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerpage {
WebDriver driver;
	
	public offerpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("tr td:nth-child(1)");
	By pagelink=By.linkText("Top Deals");
	
	
	public void clickontopdeal() {
		driver.findElement(pagelink).click();
		
	}
	
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String getproductname()
	{
		return driver.findElement(productname).getText();
		
	}
}
