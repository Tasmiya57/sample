package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tvunits 
{
	WebDriver ldriver;

    public Tvunits(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div/ul/div/div/li[2]/ul/li[2]/a/img") 
    WebElement unt;
  
    @FindBy(xpath="//h1[@data-taxon-name='TV Units']") 
    WebElement viry;
  
    @FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']") 
    WebElement cls;
    
    public WebElement clktvunit()
    {
    	return unt;
    }
    public WebElement verytvunit()
    {
    	return viry;
    }
    public void clkclose()
    {
    	cls.click();
    }
    

}
