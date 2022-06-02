package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.Tvunits;

public class Tc_urbanLadder_Tvunit10 extends BaseClass
{
	@Test
	public void TVunitTest() throws IOException, InterruptedException
	{
		Tvunits tv=new Tvunits(driver);
		
		tv.clktvunit().click();
		logger.info("clicked on tvUnit");
		
		Thread.sleep(3000);
		Assert.assertTrue(tv.verytvunit().getText().contains("TV Units"));
		logger.info("verifed the content");
		
		tv.clkclose();
		
		Thread.sleep(3000);
		captureScreen(driver, "TvUnitTest");
		logger.info("TvUnitTest Passed");
		
	}
	

}
