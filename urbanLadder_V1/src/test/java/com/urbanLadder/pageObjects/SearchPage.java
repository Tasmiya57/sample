package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver ldriver;

    public SearchPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='search']")
	WebElement icon;
	
	@FindBy(xpath="//span[@class='search-icon icofont-search']")
	WebElement bar;
	
	public void verify(String con)
	{
		icon.click();
		icon.sendKeys(con);
	}
	
	public void serachbar()
	{
		bar.click();
	}

}
