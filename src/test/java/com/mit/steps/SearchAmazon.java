package com.mit.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mit.pages.AmazonHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAmazon {
	
	public WebDriver driver;
	@Given("I am on Amazon homepage")
	public void i_am_on_amazon_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    
	}

	@When("I enter the search {string} on the search box")
	public void i_enter_the_search_on_the_search_box(String string) {
		
		// Step 1: identify/ locate the element
		//8 locators-- id, name, class name, tags, link text, partial link text, xpath, css selector,  
		AmazonHomePage ahp= new AmazonHomePage(driver);
				ahp.enterSearch(string);
		//WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		//step 2: perform the action
		//searchBox.sendKeys(string);
	}

	@When("I click on the search icon")
	public void i_click_on_the_search_icon() {
		WebElement searchBtn;
	
		searchBtn= driver.findElement(By.id("nav-search-submit-button"));
		
		searchBtn.click();
	    
	}

	@Then("I find the relevent search result")
	public void i_find_the_relevent_search_result() {
	
	    
	}

	@When("I select the first link from the results")
	public void i_select_the_first_link_from_the_results() {
		
	   
	}

	@Then("I see the right title of the product")
	public void i_see_the_right_title_of_the_product() {
	   
	}


}
