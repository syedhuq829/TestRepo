package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) 	{
		
		
		WebDriver driver;
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://login.yahoo.com/account/create");
    
    String tester = driver.getTitle();
    System.out.println(tester);
    driver.findElement(By.name("firstName")).sendKeys("Marrk");
    driver.findElement(By.name("lastName")).sendKeys("Arafat");
	
    String es = "gmail";
	 
	System.out.println(es);
    driver.navigate().to("https://login.yahoo.com/account/create");

	 //driver.close();
	
	}

}



	


