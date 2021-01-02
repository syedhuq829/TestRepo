package homeWorkTestNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homeWorkPages.PhpTravels_RegistrationPage;
import homeWorkTestNGPages.PhpTravels_SignUpPage;

public class PhpTravels_SignUpTestNGScript {


WebDriver driver;
PhpTravels_SignUpPage PhpSignUp;



    @BeforeTest

    public void InitialSetUp() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
	driver   = new ChromeDriver();
    PhpSignUp = new PhpTravels_SignUpPage(driver);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver. manage().window().maximize();
	driver.get("https://www.phptravels.net/register");
	
    }

    @Test (priority = 1)
    
    public void SignUpValidation() {
    	
    WebElement PhpSignUp = driver.findElement(By.xpath("//button[@type='submit']"));
    	 
   	String signup = PhpSignUp.getText();
   	
   	System.out.println(signup);
	  
	boolean SignUpDisplay = PhpSignUp.isDisplayed();
	
	System.out.println(SignUpDisplay);
    	
    }
    
    @Test (priority = 2)
    
    public void URLandTitleValidation() throws InterruptedException {
         	
   	String ActUrl = driver.getCurrentUrl();
    String ExpectUrl = "https://www.phptravels.net/register";
    System.out.println("The current URL is: "+ ActUrl);
    
    Assert.assertEquals(ExpectUrl, ActUrl);
       
    String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Register";
	System.out.println("The web page title is: " + ActualTitle);
	
	boolean ActualTitleDisplay = ActualTitle.contains("Register");
	System.out.println("The title contains: " + ActualTitleDisplay);
	
	Assert.assertEquals(ActualTitle, ExpectedTitle);
    
       	 
    Thread.sleep(2000);
    	
    }

    @Test (priority = 3)
    
    public void SiginUpForm() {
    	
    PhpSignUp.getfirstName().sendKeys("Mark");
    PhpSignUp.getlastName().sendKeys("Gamble");
    PhpSignUp.getmobileNumber().sendKeys("703 234 5678");
    PhpSignUp.getEmail().sendKeys("PhpTest@gmail.com");
    PhpSignUp.getpassWord().sendKeys("Test#35");
    PhpSignUp.getconfirmPassWord().sendKeys("Test#356$");
   //PhpSignUp.clickSubmitbutton().click();
    		
   
   // assertEquals(driver.findElement(By.id("Your Id for the message")).getText(), "Password not matching with confirm password.");
  /*
   * try {
    assertEquals(driver.findElement(By.id("Your Id for the message")).getText(), "Invalid UserID or Password Entered");

    //If the message is displayed
    //Password not matching with confirm password.

    System.out.println("PASS");

} catch (Exception e) {

    //If the message is not displayed

    System.out.println("FAIL");

    verificationErrors.append(e.toString());

}
share  follow 

   */
    
   	
    }

	
}
