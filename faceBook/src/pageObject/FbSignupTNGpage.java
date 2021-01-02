package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// All the web elements for fb sign Up page should be in this page
public class FbSignupTNGpage {

WebDriver driver;
    
// must create a constructor and it should be the same name of the class, which will take driver as a input
// driver  = x is the variable (always give a meaningful name so can easily identified
	   public FbSignupTNGpage(WebDriver signup) {
	    	 
	   driver = signup;	 
	    	 
	     }
	
// each function has to be in separate scope ({opening  and closing} ) and must import the web driver, 
// using " public web element" to find out the page web elements and
// WebElement is am component of the web page (first Name)
// messenger is the variable of "WebElement" and the driver is variable of the "WebDriver"
// end of the function it return the web element

	     public WebElement getfirstname ()  {
 	    	 
	 	 WebElement firstname = driver.findElement(By.id("u_0_n"));
	 	 return firstname;
	 	    	 
	 	     }
	
         public WebElement getlastname ()  {
 	    	 
	 	     WebElement lastname = driver.findElement(By.id("u_0_p"));
	 	     return lastname;
	 	    	 
	 	     }
	
         public WebElement getemail ()  {
 	    	 
	 	     WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
	 	     return email;
	 	    	 
	 	     }
         
         public WebElement getconfemail ()  {
 	    	 
	 	     WebElement confemail = driver.findElement(By.name("reg_email_confirmation__"));
	 	     return confemail;
	 	    	 
	 	     }  
         
         public WebElement getpassword ()  {
 	    	 
	 	     WebElement password = driver.findElement(By.name("reg_passwd__"));
	 	     return password;
	 	    	 
	 	     }
          
         public void setmonth(String month){
        	    
        	    WebElement dropdown = driver.findElement(By.name("birthday_month"));
        	    Select monthSelect = new Select(dropdown);
        	    monthSelect.selectByVisibleText(month);
        	    }
        	    
        	    public void setday(String day) {
        	    	
        	    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        	    Select daySelect = new Select(dropdown);
        	    daySelect.selectByVisibleText(day);
        	    }
         
            public WebElement getbirthy ()  {
    	    	 
   	 	     WebElement birthy = driver.findElement(By.xpath("//*[@id=\"year\"]"));
   	 	     return birthy;
   	 	    	 
   	         } 
           
            public void selectGender(String gender) {
                if(gender.equals("Female")) {
                driver.findElement(By.id("u_0_6")).click();	
                	
                }
                else if(gender.equals("Male")) {
                driver.findElement(By.id("u_0_7")).click();
                }
                else 
                	driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
                }
                  
   		    public WebElement getmessengerLink()  {
	    	 
	        WebElement messenger = driver.findElement(By.linkText("Messenger"));
	        return messenger;
	    	 
	        }
	
      }


