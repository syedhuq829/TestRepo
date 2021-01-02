package stepsDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FbSignUpPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignUpStepsDef {
	
	WebDriver driver;
	FbSignUpPage fbp;
	
	@Before 
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Desktop\\eclipseWS\\Library\\chromedriver.exe");												
		driver   = new ChromeDriver(); 
	
	}
		
	@After
	public void finishTest() {
	driver.quit();
	}
		
	@Given("^user is on the facebook Sign Up page$")
	public void user_is_on_the_facebook_Sign_Up_page() throws Throwable {
	  
		 fbp = new FbSignUpPage(driver);
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver. manage().window().maximize();
		 driver.get("https://www.facebook.com/r.php");
		}
	
	@When("^user are on the right url$")
	public void user_are_on_the_right_url() throws Throwable {
	  
		String expected = "https://www.facebook.com/r.php";
	    String actual   = driver.getCurrentUrl();
	    junit.framework.Assert.assertEquals(expected, actual);
		
	}

	@When("^user can see the titile of the page$")
	public void user_can_see_the_titile_of_the_page() throws Throwable {
	   
		String actualtitle = driver.getTitle();
	    String expectedtitle = "Sign Up for Facebook | Facebook";
	    junit.framework.Assert.assertEquals(expectedtitle, actualtitle);
	    System.out.println(actualtitle);
	
	}

	@When("^user can enter the details$")
	public void user_can_enter_the_details() throws Throwable {
	   
	}

	@When("^user can start creating a new account$")
	public void user_can_start_creating_a_new_account() throws Throwable {
	  
	}

	@Then("^user should be able to closer the browser$")
	public void user_should_be_able_to_closer_the_browser() throws Throwable {
	  
	}

	@When("^user can enter the FirstName \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_FirstName_in_facebook(String arg1) throws Throwable {
	    
		Thread.sleep(1000);  
		fbp.getfirstname().sendKeys(arg1);
	
	}

	@When("^user can enter the LastName \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_LastName_in_facebook(String arg1) throws Throwable {
	    
		Thread.sleep(1000);  
		fbp.getlastname().sendKeys(arg1);
	
	}

	@When("^user can enter the Email \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Email_in_facebook(String arg1) throws Throwable {
	   
		Thread.sleep(1000);
		fbp.getemail().sendKeys(arg1);
	
	}

	@When("^user can enter the ConfirmEmail \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_ConfirmEmail_in_facebook(String arg1) throws Throwable {
	   
		Thread.sleep(1000);
		fbp.getconfemail().sendKeys(arg1);
	
	}

	@When("^user can enter the Password \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Password_in_facebook(String arg1) throws Throwable {
	    
		Thread.sleep(1000);
		fbp.getpassword().sendKeys(arg1);
	
	}

	@When("^user can enter the Month \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Month_in_facebook(String arg1) throws Throwable {
	    
		fbp.setmonth(arg1);
	
	}

	@When("^user can enter the Day \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Day_in_facebook(String arg1) throws Throwable {
	   
		fbp.setday(arg1);
	
	}

	@When("^user can enter the Birthy \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Birthy_in_facebook(String arg1) throws Throwable {
	  
		Thread.sleep(2000);
		fbp.getbirthy().sendKeys(arg1);
	
	}

/*	@When("^user can enter the Gender \"([^\"]*)\" in facebook$")
	public void user_can_enter_the_Gender_in_facebook(String arg1) throws Throwable {
	   
		Thread.sleep(2000);    
		fbp.selectGender(arg1);
	
	} 
	*/

}
