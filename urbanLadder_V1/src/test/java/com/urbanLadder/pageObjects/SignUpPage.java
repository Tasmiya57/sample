package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage 
{
	WebDriver ldriver;

    public SignUpPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	WebElement icon;
	
    @FindBy(linkText="Sign Up")
	WebElement clksignup;
    
    @FindBy(xpath="//input[@class='textfield email required input_authentication email-suggest']")
    WebElement eml;
    
    @FindBy(xpath="//input[@class='textfield required input_authentication']")
    WebElement pswd;
    
    @FindBy(xpath="//input[@class='button primary signup']")
    WebElement sub;
    
    public void clickPaths()
	{
		icon.click();
	}
	public void clicksignup()
	{
		clksignup.click();
	}
    
    public void entuname(String email)
    {
    	eml.click();
    	eml.sendKeys(email);
    }
    
    public void enpswd(String pass)
    {
    	pswd.click();
    	pswd.sendKeys(pass);
    }
    
    public void submit()
    {
    	sub.click();
    }

}
