package com.urbanLadder.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.urbanLadder.pageObjects.KidsRoomPage;

public class Tc_urbanLadder_Kids08 extends BaseClass
{
	@Test
	public void kidsRoomTest() throws IOException, InterruptedException
	{
		KidsRoomPage kd=new KidsRoomPage(driver);
		
		kd.clkKid();
		Thread.sleep(3000);
		logger.info("clicked on kids room");
		
		kd.clkKidChair();
		Thread.sleep(3000);
		logger.info("clicked on kids chair");
		
		kd.clkclose();
		
		Thread.sleep(3000);
		captureScreen(driver, "kidsRoomTest");
		logger.info("kidsRoomTest Passed");
	}

}
