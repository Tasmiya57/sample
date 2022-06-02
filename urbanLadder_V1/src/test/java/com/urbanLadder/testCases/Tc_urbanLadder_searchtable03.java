package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.LoginPage;
import com.urbanLadder.pageObjects.SearchPage;

public class Tc_urbanLadder_searchtable03 extends BaseClass
{
	@Test
	public void searchTable() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.clickPath();
		logger.info("clicked on icon...");
		
		lp.clicklogin();
		logger.info("Login page opened...");
		
		Thread.sleep(3000);
		
		lp.setUsername("tasmiya0607@gmail.com");
		logger.info("Entered username");
		
		lp.setpassword("AruvYhu@87654321");
		logger.info("Entered password");
		
		lp.btnSubmit();
		logger.info("Login succefully");
		
		SearchPage sr=new SearchPage(driver);

		sr.verify("study table");
		sr.serachbar();
		Thread.sleep(3000);
		logger.info("Search study table successful");

		captureScreen(driver, "searchtable");

	}

}
