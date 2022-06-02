package com.urbanLadder.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.urbanLadder.pageObjects.SignUpPage;

public class Tc_urbanLadder_signup01 extends BaseClass
{
	@Test
	public void SignupTest() throws IOException, InterruptedException
	{
		SignUpPage sp=new SignUpPage(driver);
		
		sp.clickPaths();
		logger.info("clicked on icon...");
		
		sp.clicksignup();
		logger.info("signup page opened...");
		
		Thread.sleep(5000);
		
		String email=randomString()+"@gmail.com";
		sp.entuname(email);
		logger.info("Entered username");
		
		String passwrd=randomString()+"@12345678";
		sp.enpswd(passwrd);
		logger.info("Entered password");
		
		sp.submit();
		logger.info("Successfully signup");
		
		captureScreen(driver, "signupTest");
	}

	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
}
