package homeWorkTestScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import homeWorkPages.yahooSignUpPage;

	   public class yahooSignUpTestScript {
			
	   public static void main(String[] args) throws InterruptedException {
			
	   WebDriver driver;
	   yahooSignUpPage yhSignUp;
						
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");												
	   driver   = new ChromeDriver();
	   yhSignUp = new yahooSignUpPage(driver);
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().deleteAllCookies();
	   driver. manage().window().maximize();
	   driver.get("https://login.yahoo.com/account/create");
			
	   yhSignUp.getfirstName().sendKeys("Mark");
	  // yhSignUp.getfirstName().clear();
       yhSignUp.getlastName().sendKeys("Gamble");
	   yhSignUp.getEmail().sendKeys("test");
	   yhSignUp.getPassword().sendKeys("test13");
	   yhSignUp.setcountryCode("AU");
	   yhSignUp.getphoneNumber().sendKeys("7033456789");
	   yhSignUp.setmonth("11");
	   yhSignUp.getbirthday().sendKeys("30");
	   yhSignUp.getbirthyear().sendKeys("1997");
	   yhSignUp.getGender().sendKeys("Male");
				 
	   WebElement yhoSignUpA = driver.findElement(By.xpath("//*[@id=\"regform\"]/p[1]"));
	   
	   String Alaert = yhoSignUpA.getText();
	   
	   System.out.println(Alaert);
	   
	   WebElement yhoSignUp = driver.findElement(By.xpath("//button[@type='submit']"));
	 	 
	   String strg = yhoSignUp.getText();
	 	 
	   System.out.println(strg);
	 	  
	   boolean SignUpDispaly = yhoSignUp.isDisplayed();
	 	 
	   System.out.println(SignUpDispaly);
	 	 
	   boolean SignUpEnable = yhoSignUp.isEnabled();
	 	 
	   System.out.println(SignUpEnable);  
	 	 
	   String url = driver.getCurrentUrl();
	   System.out.println("The current URL is: "+ url);
	 	 
	   String title = driver.getTitle();
	 	 
	   System.out.println("The title is: " + title);  
	 	 
	   Thread.sleep(2000);
	 	 
	   driver.close();	
	  
		
		}
		
		
	}
		

		
		
	


