package com.mit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	WebDriver driver;
	public AmazonHomePage (WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
	}
	//WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	@FindBy(id= "twotabsearchtextbox")
	WebElement searchBtn;
	
	//searchBox.sendKeys(string);
	public void enterSearch(String string) {
		searchBtn.sendKeys(string);
	}
}
