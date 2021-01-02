package testScripts;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.FbTestUtility;

public class FbDataDrivenTest {

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
	
	/*try {
		data = FbTestUtility.getTestData("TestData");
	} catch (InvalidFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	return data;
   }
    @Test(dataProvider = "getSignupData")
   public void FbSignUpTest(String FirstName,String LastName,String Email,String NewPassword,String BirthMonth,String BirthDay,String BirthYear,String SelectGender) throws InterruptedException {
	   
	    	driver.findElement(By.id("u_0_n")).sendKeys(FirstName);
				     
		    driver.findElement(By.id("u_0_p")).sendKeys(LastName);  
	 	  
	     	driver.findElement(By.name("reg_email__")).sendKeys(Email);  
			         
			driver.findElement(By.name("reg_passwd__")).sendKeys(NewPassword);  
			    
	        driver.findElement(By.name("birthday_month")).sendKeys(BirthMonth);
	        
	        driver.findElement(By.id("day")).sendKeys(BirthDay);
			         
			driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys(BirthYear);
		
			if(SelectGender.equals("Female"))
	        {
			driver.findElement(By.id("u_0_6")).click();
	      	System.out.println("The Female Gender value is : " +SelectGender);
	         
	        }else if(SelectGender.equals("Male"))
	       
	        {
	        driver.findElement(By.id("u_0_7")).click();
	           		
	        System.out.println("The Gender value is : " +SelectGender);
	                   	
	        }
	        else
	       	{
	        driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
	           		
	        System.out.println("Other Gender value passed.");
	       	}	 
			//driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).sendKeys(Female);
			
			//driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).sendKeys(Male);
			
		    Thread.sleep(4000);
  
            }


@AfterMethod
   public void tearDown() {
	   driver.quit();
            }

     }

