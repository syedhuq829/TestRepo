package homeWorkTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homeWorkPages.AutomationPracticeHomePage;
import homeWorkPages.AutomationPracticePage;

public class AutomationPracticeHomeTestScripts {

WebDriver driver;

AutomationPracticeHomePage HomePage;

@BeforeTest

public void beforeTestsepUp() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");												
    driver   = new ChromeDriver();
    HomePage = new AutomationPracticeHomePage(driver);
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver. manage().window().maximize();
    driver.get("http://automationpractice.com/index.php");
    
    Thread.sleep(4000);

}
	
/*	
@Test

public void DresscategoryOptions() throws InterruptedException {
	
	
	HomePage.selectCategory("T-SHIRTS");
	

	
	Thread.sleep(4000);
}*/





}
