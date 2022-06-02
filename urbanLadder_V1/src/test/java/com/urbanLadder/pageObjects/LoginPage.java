package com.urbanLadder.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;

    public LoginPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	WebElement clkpath;
	
	@FindBy(linkText="Log In")
	WebElement clklogin;
	
	@FindBy(xpath="//input[@class='email required input_authentication']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='required input_authentication']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button primary']")
	WebElement clksubmit;
	
	public void clickPath()
	{
		clkpath.click();
	}
	public void clicklogin()
	{
		clklogin.click();
	}
	public void setUsername(String uname)
	{
		username.click();
		username.sendKeys(uname);
	}
	public void setpassword(String pswd)
	{
		password.click();
		password.sendKeys(pswd);
	}
	public void btnSubmit()
	{
		clksubmit.click();
	}

}
