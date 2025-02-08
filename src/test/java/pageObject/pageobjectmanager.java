package pageObject;

import org.openqa.selenium.WebDriver;

public class pageobjectmanager {
	public landingpage l1;
	WebDriver driver;

	
	public pageobjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	public landingpage getlandingpageobject() {
		landingpage l1=new landingpage(driver);
		return l1;
		
	}
	public offerpage getofferpageobject(){
		offerpage offerpageobjet=new offerpage(driver);
		return offerpageobjet;
	}
	
}
