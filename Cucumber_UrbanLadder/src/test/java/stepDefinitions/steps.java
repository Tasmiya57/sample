package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
import utility.BaseClass;

public class steps extends BaseClass
{
	@Before
	public void setup() throws IOException
	{
		logger=Logger.getLogger("urbanLadder");
		PropertyConfigurator.configure("Log4j.properties");
		
		//Reading properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);

		String br=configProp.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
			driver=new InternetExplorerDriver();
		}
       
		
		logger.info("****Launching browser*****");	
	}

	@Given("Open the Browser")
	public void open_the_Browser() 
	{
		sp=new SignUpPage(driver);
	   
	}

	@Given("Enter into the {string} Website")
	public void enter_into_the_Website(String url) 
	{
		logger.info("Opening URL");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Given("user need to click on svg icon")
	public void user_need_to_click_on_svg_icon() 
	{
		sp.clickPaths(); 
		logger.info("clicked on icon");
	}

	@Given("user need to click on sign up")
	public void user_need_to_click_on_sign_up() 
	{
		sp.clicksignup();
		logger.info("clicked on sign up");
	    
	}

	@Given("Enter email address as {string}")
	public void enter_email_address_as(String email) throws InterruptedException 
	{
		Thread.sleep(3000);
	    email=randomestring()+"@gmail.com";
		sp.entuname(email);
		logger.info("entered email");
	  
	}

	@Given("Enter password as {string}")
	public void enter_password_as(String password) 
	{
		password=randomestring()+"Aa@12345678";
		sp.enpswd(password);
	   logger.info("entered password");
	}

	@Then("Click on sign up")
	public void click_on_sign_up() throws IOException 
	{
	    sp.submit();
	    logger.info("clicked on submit");
	    logger.info("successfully signup");
	    captureScreen(driver, "signupTest");
	}
	
	@Given("user need to click on Login")
	public void user_need_to_click_on_Login() 
	{
		lp=new LoginPage(driver);
		lp.clicklogin();
		logger.info("clicked on login");
	}

	@Given("Enter email as {string} and password as {string}")
	public void enter_email_as_and_password_as(String mail, String pwsd) throws InterruptedException 
	{
		Thread.sleep(3000);
	   lp.setUsername(mail);
	   logger.info("entered email");
	   lp.setpassword(pwsd);
	   logger.info("entered password");
	}

	@Then("Click on submit")
	public void click_on_submit() throws IOException
	{
		lp.btnSubmit();
		 logger.info("clicked on submit");
		logger.info("successfully login");
		captureScreen(driver, "LoginTest");
	}
	
	@Given("user need to click on search box and enter {string} to search")
	public void user_need_to_click_on_search_box_and_enter_to_search(String string) 
	{
		sr=new SearchPage(driver);
		sr.verify(string);
		logger.info("Entered the value for serach");
	}

	@Then("click on serach icon")
	public void click_on_serach_icon() throws IOException, InterruptedException 
	{
		sr.serachbar();
		logger.info("clicked on serach icon");
		
		Thread.sleep(5000);
		sr.clkclose();
		
		Thread.sleep(3000);
	    logger.info("searched successful");
	    captureScreen(driver, "SearchTest");
	}
	
	@Given("user need to click on GiftCard")
	public void user_need_to_click_on_GiftCard() 
	{
	   gf=new GiftcardPage(driver);
	   gf.clkgift();
	   logger.info("clicked on giftcards");
	}

	@Then("verify the given content")
	public void verify_the_given_content() throws InterruptedException, IOException 
	{
	    Thread.sleep(3000);
	    Assert.assertTrue(gf.verifytxt().getText().contains("Gift Cards"));
		logger.info("verified the given content");
		logger.info("Giftcard test completed");
		
		captureScreen(driver, "validateGiftcard");
	}
	
	@Given("user need to click on stores")
	public void user_need_to_click_on_stores() 
	{
		str=new storesPage(driver);
		str.clkstores();
		logger.info("clickwd on stores"); 
	}

	@Then("Click on viewdetails")
	public void click_on_viewdetails() throws IOException 
	{
		str.viewDetail();
		logger.info("clicked on view details");
		logger.info("Urban Ladder Experience Centre details willl be displayed");
		
		logger.info("Stores Test passed");
		captureScreen(driver, "StoresTest");
	}
	
	@Given("click on search bar")
	public void click_on_search_bar() 
	{
		mtr=new MattressesPage(driver);
		mtr.serachbar();
		logger.info("clicked on search bar");
	}

	@Then("verify the content present in mattresses")
	public void verify_the_content_present_in_mattresses() throws IOException, InterruptedException 
	{
		Assert.assertEquals(mtr.matteressVerify().getText(), "Customer Stories");
		logger.info("verified customer stories");
		
		Thread.sleep(5000);
		mtr.clkclose();
		
		Thread.sleep(3000);
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
	
	@Given("user need to click on top deals")
	public void user_need_to_click_on_top_deals() 
	{
	   sf=new SofaBedPage(driver);
	   sf.mmlrverify();
	   logger.info("clicked on top deals");
	}

	@Given("user need to click on sofa beds")
	public void user_need_to_click_on_sofa_beds() throws InterruptedException 
	{
		 Thread.sleep(3000);
		sf.clkfabric().click();
		logger.info("clicked on sofa beds");
	}

	@Then("click on close for the popup")
	public void click_on_close_for_the_popup() throws InterruptedException, IOException 
	{
		Thread.sleep(5000);
		sf.clkclose();
		Thread.sleep(2000);
		logger.info("sofa bed page opened");
		logger.info("Sofabed Test passed");
	   captureScreen(driver, "SofabedTest");    
	}
	
	@Given("user need to click on kids room")
	public void user_need_to_click_on_kids_room() 
	{
		kd=new KidsRoomPage(driver);
		kd.clkKid();
		logger.info("clicked on kids room");
	}

	@Given("user need to click on kids chair")
	public void user_need_to_click_on_kids_chair() throws InterruptedException 
	{
		Thread.sleep(3000);
		kd.clkKidChair();
		logger.info("clicked on kids chair");
	}

	@Then("close the popup")
	public void close_the_popup() throws InterruptedException, IOException 
	{
		Thread.sleep(5000);
		kd.clkclose();
		Thread.sleep(2000);
		logger.info("Kids chair page opened");
		logger.info("KidsRoom Test passed");
	   captureScreen(driver, "KidsRoomTest"); 

	}

	@Given("user need to click on about us")
	public void user_need_to_click_on_about_us() 
	{
		ab=new AboutPage(driver);
		ab.clkabout().click();
		logger.info("clicked on about us");
	}

	@Then("verify the content")
	public void verify_the_content() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		Assert.assertTrue(ab.veryabout().getText().contains("Honesty & Transparency"));
		logger.info("verified the content");
		logger.info("Aboutus Test Passed");
		captureScreen(driver, "AboutusTest");
		
	}

	@Given("user need to click on Tv unit")
	public void user_need_to_click_on_Tv_unit() throws InterruptedException 
	{
		tv=new Tvunits(driver);
		tv.clktvunit().click();;
		logger.info("clicked on tv unit");
		Thread.sleep(3000);
	}

	@Then("verify the content of Tvunit")
	public void verify_the_content_of_Tvunit() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		Assert.assertTrue(tv.verytvunit().getText().contains("TV Units"));
		logger.info("verifed the content");
		
		Thread.sleep(5000);
		tv.clkclose();
		
		Thread.sleep(3000);
		captureScreen(driver, "TvUnitTest");
		logger.info("TvUnitTest Passed");
	    
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
