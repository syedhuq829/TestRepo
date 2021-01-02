package homeWork3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravels_Registration {

	public static void main(String[] args) throws InterruptedException {
	
     WebDriver driver;
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
	 driver   = new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver. manage().window().maximize();
	 driver.get("https://www.phptravels.net/register");
/*	 
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[1]/div/label/span")).sendKeys("Mark");
	
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/div[2]/div/label/span")).sendKeys("Gamble");
	 
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/label/span")).sendKeys("7033456789");
	 
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/label/span")).sendKeys("test@gmail.com");
	 
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/label/span")).sendKeys("test13");
	 
	 driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/label/span")).sendKeys("test13"); 
	 
	 boolean signup = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(); */
	 
	 WebElement SignUp = driver.findElement(By.xpath("//button[@type='submit']"));
	 
	 String strg = SignUp.getText();
	 
	 System.out.println(strg);
	  
	 boolean SignUpDispaly = SignUp.isDisplayed();
	 
	 System.out.println(SignUpDispaly);
	 
	 boolean SignUpEnable = SignUp.isEnabled();
	 
	 System.out.println(SignUpEnable);  
	 
	 String url = driver.getCurrentUrl();
	 System.out.println("The current URL is: "+ url);
	 
	 String title = driver.getTitle();
	 
	 System.out.println("The title is: " + title);
	 
	 
	 Thread.sleep(1000);
	 
	 driver.close();
	}

}
