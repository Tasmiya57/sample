package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class storesPage
{
	WebDriver ldriver;

    public storesPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Stores")
	WebElement clkstore;
	
	@FindBy(xpath="//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb']")
	WebElement view;
	
	public void clkstores()
	{
		clkstore.click();
	}
	public void viewDetail()
	{
		view.click();
	}
}
