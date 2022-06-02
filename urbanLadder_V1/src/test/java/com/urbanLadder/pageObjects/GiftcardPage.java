package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftcardPage 
{
	WebDriver ldriver;

    public GiftcardPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(linkText="Gift Cards")
	WebElement crd;
    
    @FindBy(xpath="//h1[@class='_1bluI']")
   	WebElement vry;
    
    public void clkgift()
    {
    	crd.click();
    }
    
    public WebElement verifytxt()
    {
    	return vry;
    }
	
}
