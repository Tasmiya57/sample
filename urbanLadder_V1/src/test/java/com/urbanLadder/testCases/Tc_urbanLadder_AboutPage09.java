package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.AboutPage;

public class Tc_urbanLadder_AboutPage09 extends BaseClass
{
	@Test
	public void aboutTest() throws IOException, InterruptedException
	{
		AboutPage abt=new AboutPage(driver);
		Thread.sleep(2000);
		abt.clkabout().click();
		logger.info("clicked on about us");
		
		Thread.sleep(3000);
		Assert.assertTrue(abt.veryabout().getText().contains("Honesty & Transparency"));
		logger.info("verified the content");
		
		captureScreen(driver, "AboutusTest");
		logger.info("AboutTest Passed");
		
	}

}
