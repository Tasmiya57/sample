package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.storesPage;

public class Tc_urbanLadder_Stores05 extends BaseClass
{
	@Test
	public void storesTest() throws IOException, InterruptedException
	{
		storesPage str=new storesPage(driver);
		
		str.clkstores();
		logger.info("clicked on stores");
		
		str.viewDetail();
		logger.info("Clicked successfully on view details");
		
		captureScreen(driver, "storesTest");
		logger.info("StorePage test passed");
		
	}

}
