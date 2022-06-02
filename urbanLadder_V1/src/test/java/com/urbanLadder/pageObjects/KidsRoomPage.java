package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsRoomPage 
{
	WebDriver ldriver;

    public KidsRoomPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="//li[@class='topnav_item kidsroomunit']") 
    WebElement clkkids;
    
    @FindBy(xpath="//li[@class='subnav_item 14420']") 
    WebElement kidch;
    
    @FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']") 
    WebElement cls;
    
    public void clkKid()
    {
    	clkkids.click();
    }
    public void clkKidChair()
    {
    	kidch.click();
    }
    public void clkclose()
    {
    	cls.click();
    }

}
