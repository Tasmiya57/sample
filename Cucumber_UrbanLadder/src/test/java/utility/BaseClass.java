package utility;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pageObject.AboutPage;
import pageObject.GiftcardPage;
import pageObject.KidsRoomPage;
import pageObject.LoginPage;
import pageObject.MattressesPage;
import pageObject.SearchPage;
import pageObject.SignUpPage;
import pageObject.SofaBedPage;
import pageObject.Tvunits;
import pageObject.storesPage;

public class BaseClass 
{
	public WebDriver driver;
	public SignUpPage sp;
	public LoginPage lp;
	public SearchPage sr;
	public GiftcardPage gf;
	public storesPage str;
	public MattressesPage mtr;
	public SofaBedPage sf;
	public KidsRoomPage kd;
	public AboutPage ab;
	public Tvunits tv;
	public static Logger logger;
	public Properties configProp;
	
	//Created for generating random string for unique email
	public static String randomestring()
	{
		String generatedString1= RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"/Screenshorts/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
		
	}

}
