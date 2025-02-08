package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.landingpage;
import pageObject.pageobjectmanager;
import utils.testcontext;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class landingpagestepdefinition {
	public WebDriver driver;
	String actualproduct;
	String productname;
	testcontext test1;
	
	public landingpagestepdefinition(testcontext test1) {
		this.test1=test1;
	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() throws InterruptedException {
		System.out.println("this is the landing page");
		System.out.println("this is the landing page1");
		
	    
	}
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name) throws InterruptedException
	{
		landingpage landingpage=test1.pageobjectmanager.getlandingpageobject();
	    landingpage.searchItem(name);
	    Thread.sleep(500);///here we added the time to load the browser
	    test1.productname=landingpage.getproductname().split("-")[0].trim();	   
	}
		
}
