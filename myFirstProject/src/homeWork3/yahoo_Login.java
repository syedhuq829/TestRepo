package homeWork3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahoo_Login {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
			
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
		 driver   = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver. manage().window().maximize();
		 driver.get("https://login.yahoo.com/account/create");
		 
		 driver.findElement(By.id("usernamereg-firstName")).sendKeys("Mark");
		
		 driver.findElement(By.name("lastName")).sendKeys("Gamble");
		 		 	 
		 driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("test");
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test13");
		 
		 WebElement shortCode = driver.findElement(By.name("shortCountryCode"));
		 
		 Select countryCode = new Select(shortCode);
		 
		 countryCode.selectByValue("AU");
		 
		 driver.findElement(By.name("phone")).sendKeys("7033456789");
		 
		 WebElement month = driver.findElement(By.xpath("//select[@name='mm']")); 
		 
		 Select birthMonth = new Select(month);
		 
		 birthMonth.selectByValue("1");
		 
		 driver.findElement(By.name("dd")).sendKeys("20");
		 
		 driver.findElement(By.name("yyyy")).sendKeys("2001");;
		 		
		 driver.findElement(By.xpath("//*[@id=\"usernamereg-freeformGender\"]"));
		 
         WebElement byClickingContinue = driver.findElement(By.xpath("//*[@id=\"regform\"]/p[1]"));
		 
		 String continu = byClickingContinue.getText();
		 
		 System.out.println(continu);
		
		 
		 WebElement Continue = driver.findElement(By.id("reg-submit-button"));
		 
		 String strg = Continue.getText();
		 
		 System.out.println(strg);
		  
		 boolean ContinueDispaly = Continue.isDisplayed();
		 
		 System.out.println(ContinueDispaly);
		 
		 boolean ContinueEnable = Continue.isEnabled();
		 
		 System.out.println(ContinueEnable);  
		 
		 String url = driver.getCurrentUrl();
		 System.out.println("The current URL is: "+ url);
		 
		 String title = driver.getTitle();
		 
		 System.out.println("The title is: " + title);  
		 
		 
		 Thread.sleep(2000);
		 
		// driver.close();
		 
		}

	}
	
	
	
	


