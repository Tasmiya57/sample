package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaBedPage 
{
	WebDriver ldriver;

    public SofaBedPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="//li[@class='topnav_item topdealsunit']") 
    WebElement mrl;
    
    @FindBy(xpath="//li[@class='subnav_item 15040']")
    WebElement fap;
    
    @FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']") 
    WebElement cls;
    
    public void mmlrverify()
    {
    	mrl.click();
    }
    public WebElement clkfabric()
    {
    	
    	return fap;
    }
    public void clkclose()
    {
    	cls.click();
    }
    

}
