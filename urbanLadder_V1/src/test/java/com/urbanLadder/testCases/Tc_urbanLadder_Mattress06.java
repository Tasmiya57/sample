package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.MattressesPage;

public class Tc_urbanLadder_Mattress06 extends BaseClass
{
	@Test
	public void MattressTest() throws IOException, InterruptedException
	{
		MattressesPage matt=new MattressesPage(driver);
		
		matt.verify("Mattresses");
		logger.info("search for mattresses");
		
		matt.serachbar();
		logger.info("clicked on serach icon");
		
		Assert.assertEquals(matt.matteressVerify().getText(), "Customer Stories");
		logger.info("verified customer stories");
		
		if(driver.getTitle().equals("Furniture Online: @Upto 70% Off on Wooden Furniture Online in India at Best Price - Urban Ladder"))
		{
			captureScreen(driver, "MattressTest");
			logger.info("MattressTest passed");
		}
		else
		{
			logger.info("MattressTest failed");
		}
	}
}
