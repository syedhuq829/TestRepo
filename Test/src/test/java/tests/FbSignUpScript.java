package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbSignUpPage;

public class FbSignUpScript {


	WebDriver      driver;
	Pages.FbSignUpPage fbh;
	
	
	
	@BeforeTest
	
	public void StartSetup( ) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Desktop\\eclipseWS\\Library\\chromedriver.exe");												
	 driver   = new ChromeDriver();
	 fbh = new Pages.FbSignUpPage(driver);
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver. manage().window().maximize();
	 driver.get("https://www.facebook.com/r.php");
	}

	@Test
	
	public void StartTest() throws InterruptedException  {
		
		fbh.getfirstname().sendKeys("Michael");
		fbh.getlastname().sendKeys("Jordan");
		fbh.getemail().sendKeys("Michael@gmail.com");
    	fbh.getconfemail().sendKeys("Michael@gmail.com");
    	fbh.getpassword().sendKeys("M1234");
    	fbh.setmonth("Nov");
    	fbh.setday("20");
    	Select birthy = new Select(fbh.getbirthy());
        birthy.selectByValue("2001");
        //fbh.selectGender("Male");
     
         Thread.sleep(3000);
	}
	
	@AfterTest
	
	public void closetestscript() {
		
		driver.quit();
	}
}






