package com.urbanLadder.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.GiftcardPage;

public class Tc_urbanLadder_giftcard04 extends BaseClass
{
	@Test
	public void validateGiftcard() throws IOException
	{
		GiftcardPage gf=new GiftcardPage(driver);
		
		gf.clkgift();
		logger.info("Gift cards page opened");
		
		Assert.assertTrue(gf.verifytxt().getText().contains("Gift Cards"));
		logger.info("verified the given content");
		
		captureScreen(driver, "validateGiftcard");
	}

}
