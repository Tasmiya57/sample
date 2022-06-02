package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage 
{
	WebDriver ldriver;

    public AboutPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="//*[@id=\"footer-links\"]/div[1]/div[1]/ul[1]/li[1]/a") 
    WebElement abt;
    
    @FindBy(xpath="//*[@id=\"page_content\"]/div[1]/div/ul/li[3]") 
    WebElement vry;
    
    public WebElement clkabout()
    {
    	return abt;
    }
    public WebElement veryabout()
    {
    	return vry;
    }
    

}
