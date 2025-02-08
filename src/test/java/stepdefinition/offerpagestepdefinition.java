package stepdefinition;

import io.cucumber.java.en.Then;
import pageObject.offerpage;
import pageObject.pageobjectmanager;
import utils.testcontext;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class offerpagestepdefinition {
	public WebDriver driver;
	String actualproduct;
	testcontext test1;
	
	public offerpagestepdefinition(testcontext test1) {
		this.test1=test1;
	}
	
	@Then("^user searched for same shortname (.+) in offers page to check if product exist$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String name1) throws InterruptedException {
		offerpage offerpage=test1.pageobjectmanager.getofferpageobject();
		offerpage.clickontopdeal();
		switchwindow();
	    offerpage.searchItem(name1);
	    Thread.sleep(300);
	    actualproduct=offerpage.getproductname();
	    
	}
	
	@Then("matched actual name and offer name")
	public void matched_actual_name_and_offer_name() {
		System.out.println(actualproduct+" "+test1.productname);
		Assert.assertEquals(test1.productname,actualproduct);	    
	}
	public void switchwindow()
	{
		test1.genericutils1.switchwindow();
	}	
	
}
