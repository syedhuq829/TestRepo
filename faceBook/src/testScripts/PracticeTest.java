package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testPageObject.PracticePageObject;
public class PracticeTest {
	
	WebDriver driver;
	PracticePageObject ppo;

    @BeforeTest
	
	public void StartSetup( ) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");												
	 driver   = new ChromeDriver();
	 ppo = new PracticePageObject(driver);
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver. manage().window().maximize();
	 driver.get("https://www.facebook.com/r.php");

}

@Test
public void SignUpPageTest() throws InterruptedException {
	
	ppo.getfirstname().sendKeys("Michael");
	ppo.getlastname().sendKeys("Jordan");
	ppo.getemail().sendKeys("test@gmail.com");
	ppo.getpassword().sendKeys("Mich13");
	ppo.setmonth("Nov");
	ppo.setday("20");
	Select birthyear = new Select(ppo.getbirthyear());
	birthyear.selectByVisibleText("1960");
    ppo.selectGender("Male");

	Thread.sleep(3000);

}

@AfterTest
public void CloseTest() {
	
}


}