package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.yahooLoginTNGPage;

public class YahooLoginTestNGScript {
	
	 WebDriver driver;
	 yahooLoginTNGPage yhop;
	
     @BeforeTest
	
     public void StartSetup( ) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipseWS\\Library\\chromedriver.exe");												
	 driver   = new ChromeDriver();
	 yhop = new yahooLoginTNGPage(driver);
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver. manage().window().maximize();
	 driver.get("https://login.yahoo.com/account/create");
	
     }
	
	 @Test
     public void yahooLogin() {
		 
	 yhop.getfirstName().sendKeys("Mark");	
	 yhop.getlastName().sendKeys("Gamble");
	 yhop.getEmail().sendKeys("test");
	 yhop.getPassword().sendKeys("test13");
	 yhop.setcountryCode("AU");
	 yhop.getphoneNumber().sendKeys("7033456789");
	 yhop.setmonth("11");
	 yhop.getbirthday().sendKeys("30");
	 yhop.getbirthyear().sendKeys("1997");
		 
	 }

	 @AfterTest
	 
	 public void closeTest() {
		 
    // driver.close();
	 }
}
