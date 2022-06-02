package com.urbanLadder.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.urbanLadder.pageObjects.LoginPage;

public class Tc_urbanladder_login02 extends BaseClass
{
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.clickPath();
		logger.info("clicked on icon...");
		
		lp.clicklogin();
		logger.info("Login page opened...");
		
		Thread.sleep(3000);
		
		lp.setUsername(username);
		logger.info("Entered username");
		
		lp.setpassword(password);
		logger.info("Entered password");
		
		lp.btnSubmit();
		logger.info("Login succefully");
		
		captureScreen(driver, "LoginTest");
	}
		

}
