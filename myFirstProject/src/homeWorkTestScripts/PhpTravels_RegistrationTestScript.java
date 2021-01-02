package homeWorkTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import homeWorkPages.PhpTravels_RegistrationPage;

public class PhpTravels_RegistrationTestScript {

public static void main(String []args) throws InterruptedException	{
	
WebDriver driver;

PhpTravels_RegistrationPage phpRegis;


System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
driver   = new ChromeDriver();
phpRegis = new PhpTravels_RegistrationPage(driver);
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver. manage().window().maximize();
driver.get("https://www.phptravels.net/register");

      phpRegis.getfirstName().sendKeys("Mark");
      phpRegis.getlastName().sendKeys("Gamble");
      phpRegis.getmobileNumber().sendKeys("7032345678");
      phpRegis.getEmail().sendKeys("Test23@test.com");
      phpRegis.getpassWord().sendKeys("test012");
      phpRegis.getconfirmPassWord().sendKeys("test012");
      
      WebElement phpRegisSignUp = driver.findElement(By.xpath("//button[@type='submit']"));
 	 
 	  String strg = phpRegisSignUp.getText();
 	 
 	  System.out.println(strg);
 	  
 	  boolean SignUpDispaly = phpRegisSignUp.isDisplayed();
 	 
 	  System.out.println(SignUpDispaly);
 	 
 	  boolean SignUpEnable = phpRegisSignUp.isEnabled();
 	 
 	  System.out.println(SignUpEnable);  
 	 
 	  String url = driver.getCurrentUrl();
 	  System.out.println("The current URL is: "+ url);
 	 
 	  String title = driver.getTitle();
 	 
 	  System.out.println("The title is: " + title);
 	 
 	  Thread.sleep(2000);
 	 
      driver.close();

   }


 }
