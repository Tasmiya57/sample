package com.urbanLadder.testCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.LoginPage;
import com.urbanLadder.utilities.XLUtils;


public class Tc_urbanLadder_DDT extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.clickPath();
		Thread.sleep(2000);
		
		lp.clicklogin();
		Thread.sleep(5000);
		
		lp.setUsername(user);
		logger.info("username provided");
		
		lp.setpassword(pwd);
		logger.info("password provided");
		
		Thread.sleep(4000);
		lp.btnSubmit();
		logger.info("clicked on submit");
		Thread.sleep(2000);
		logger.info("DDT LoginTest passed");
	}
		

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/urbanLadder/testData/Book1.xlsx";

		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1",1);

		String logindata[][]=new String[rownum][colcount];

		for (int i = 1; i <=rownum; i++) 
		{
			for (int j = 0; j < colcount; j++) 
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1 0
			}
		}
		return logindata;
	}

}
