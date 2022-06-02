package com.urbanLadder.testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.SofaBedPage;

public class Tc_urbanLadder_SofaBedPage07 extends BaseClass
{
	@Test
	public void SofaBedTest() throws IOException, InterruptedException
	{
		SofaBedPage sb=new SofaBedPage(driver);
		
		sb.mmlrverify();
		Thread.sleep(3000);
		logger.info("clicked on sales");
		
		sb.clkfabric().click();
		Thread.sleep(3000);
		logger.info("clicked on sofa Beds");
		
		sb.clkclose();
		
		Thread.sleep(3000);
		captureScreen(driver, "SofaTest");
		logger.info("SofaBedTest Passed");
	}

}
