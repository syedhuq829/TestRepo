package homeWorkTestNGScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homeWorkTestNGPages.YahooSignUpTestNGPage;

	   public class YahooSignUpTestNGScript {
		
	   WebDriver driver;
	   YahooSignUpTestNGPage yhSignUp;
	   
	   @BeforeTest
	   
	   public void InitialSetUp() {
						
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");												
	   driver   = new ChromeDriver();
	   yhSignUp = new YahooSignUpTestNGPage(driver);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().deleteAllCookies();
	   driver. manage().window().maximize();
	   driver.get("https://login.yahoo.com/account/create");
	   
	   }
		
	   @Test (priority = 1)
	    
	    public void URLValidation() {
		   
		WebElement Yahoopage = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/p"));
	         	
	   	String ActualUrl = driver.getCurrentUrl();
	    String ExpectedUrl = "https://login.yahoo.com/account/create";
	    System.out.println("The Yahoo current URL is: "+ ActualUrl);
	  	  
	    String text=Yahoopage.getText();
	    if (Yahoopage.isDisplayed() && text.contains("Create a Yahoo email address"))
	    { 
	        System.out.println(text  + " \"Message displayed,you are in the correct page:");
	    }else{
	        System.out.println("Please enter all details");
	    }
		    
	    Assert.assertEquals(ExpectedUrl, ActualUrl);
	    
	    }
	    
	    @Test (priority = 2)
	    
	    public void PageTitleValidation() {
	    	
	    WebElement pageTitle = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/p"));
	       
	    String pageUrl = driver.getCurrentUrl();
	    
	    String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Yahoo";
		System.out.println("The web page title is: " + ActualTitle);
		
		boolean ActualTitleDisplay = pageTitle.isDisplayed();
		System.out.println("The title contains: " + ActualTitleDisplay);
		
		Assert.assertEquals(ExpectedTitle,ActualTitle);
	   
	   }
	   
	   @Test (priority = 3) 
	   
	   public void FillSignUpForm() {
		   
	   yhSignUp.getfirstName().sendKeys("Mark");
	   yhSignUp.getlastName().sendKeys("Gamble");
       yhSignUp.getEmail().sendKeys("gamblem33");
	   yhSignUp.getPassword().sendKeys("test13");
	   yhSignUp.setcountryCode("AU");
	   yhSignUp.getphoneNumber().sendKeys("7033456789");
	   yhSignUp.setmonth("11");
	   yhSignUp.getbirthday().sendKeys("30");
	   yhSignUp.getbirthyear().sendKeys("1997");
	   yhSignUp.getGender().sendKeys("Male");
	   	   	  
	   }
  
	   @Test (priority = 4)
	   
	   public void SignUpAleart() {
		   
	   WebElement yhoSignUpA = driver.findElement(By.xpath("//*[@id=\"regform\"]/p[1]"));
		   
	   String Alaert = yhoSignUpA.getText();
	   
	   String ActualTitle = driver.getTitle();
	   String ExpectedAlaert = "By clicking \"Continue\", you agree to the Terms and Privacy Policy";
		   
	   System.out.println(Alaert);   
	   
	   Assert.assertEquals(ExpectedAlaert,Alaert);
		   
	   }
	  
	   @Test (priority = 5)
	   
	   public void SignUpValidatton() throws InterruptedException {
		   
	   WebElement yhoSignUp = driver.findElement(By.xpath("//button[@type='submit']"));
		   
	   String signup = yhoSignUp.getText();
		
	   String  ExceptedSignUp = "Continue";
	   System.out.println(signup);
		 	  
	   boolean SignUpDispaly = yhoSignUp.isDisplayed();
		 	 
	  // System.out.println(SignUpDispaly);
		 	 
	   //Assert.assertEquals(SignUpDispaly,signup);
	   boolean SignUpEnable = yhoSignUp.isEnabled();
		 	 
	  // System.out.println(SignUpEnable);
		   
	   Thread.sleep(2000);   
		   
	   }
		   
	   @AfterTest 
	   
	   public void closeTesting() {
		   
	   driver.close();
	   }
	   
	   }
	   
	   