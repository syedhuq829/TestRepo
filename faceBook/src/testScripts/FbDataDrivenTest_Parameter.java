package testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.FbSignupTNGpage_Parameter;
import utility.FbTestUtility;

public class FbDataDrivenTest_Parameter {

  WebDriver driver;
  
  
  @BeforeMethod
  public void Setup() {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");						
	 driver   = new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver. manage().window().maximize();
	 driver.get("https://www.facebook.com/r.php");
	 
	 }

   @DataProvider
   public Object [][] getSignupData() throws IOException, InvalidFormatException {
	Object data[][] = FbTestUtility.getTestData("TestData");
		
	return data;
   }
  
   @Test(dataProvider = "getSignupData")
   public void FbSignUpTest(String FirstName,String LastName,String Email,String NewPassword,String BirthMonth,String BirthDay,String BirthYear,String gender) throws InterruptedException {
	   
	   FbSignupTNGpage_Parameter signup = new FbSignupTNGpage_Parameter(driver);

	   signup.firstname(FirstName);
	   signup.lastname(LastName);
	   signup.mobilenumber(Email);
	   signup.newpassword(NewPassword);
	   signup.Month(BirthMonth);
	   signup.Day(BirthDay);
	   signup.Year(BirthYear);
	   signup.selectGender(gender);
	  
   }
	   
 /*  @Test(dataProvider = "getBirthpData",priority = 2 )
   public void FbSignUpTest(String BirthMonth,String BirthDay,String BirthYear) throws InterruptedException {
      
	   FbSignupTNGpage_Parameter birthdate = new FbSignupTNGpage_Parameter(driver);
   
	   birthdate.Month(BirthMonth);
	   
	   birthdate.Day(BirthDay);
	   
	   birthdate.Year(BirthYear);
	   
   } */
  
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }

}


