package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbSignupTNGpage_Parameter {

	WebDriver driver;
   	          
	          By firstname = By.id ("u_0_n");
	          By lastname = By.id("u_0_p");
	          By Email = By.xpath("//*[@id=\"u_0_s\"]");
	          By newpassword = By.xpath("//*[@id=\"password_step_input\"]");
	          By Month = By.id("month");
	          By Day = By.id("day");
	          By Year = By.xpath("//*[@id=\"year\"]");
	  // By.xpath("//*[@id=\"u_0_z\"]/div[1]")        
	          void gender (String gender) {
	  	    	    if(gender.equals("Female")) {
	  		    	    driver.findElement(By.id("u_0_4")).click();	
	  		    	    	
	  		    	    }
	  		    	    else if(gender.equals("Male")) {
	  		    	    driver.findElement(By.id("u_0_5")).click();
	  		    	    }
	  		    	    else 
	  		    	    	driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
					
	  		    	    }
	          
	         // By Female = By.id("u_0_4");
	         // By Male = By.id("u_0_5");
	         // By Custom = By.xpath("//*[@id=\"u_0_8\"]");
	         

	          public FbSignupTNGpage_Parameter(WebDriver driver) {
	        	  
	          this.driver = driver;  
	        	  
	       }
	          
	      public void firstname (String fname)
	      
	      {
	    	 driver.findElement(firstname).sendKeys(fname);
	      }
	   
	      public void lastname(String lname)
	      {
	      driver.findElement(lastname).sendKeys(lname);	
	      	
	      }

	      public void mobilenumber(String email)
	      {
	      	
	      driver.findElement(Email).sendKeys(email);	
	      }

	      public void newpassword(String passw)
	      {
	      driver.findElement(newpassword).sendKeys(passw);
	      	
	      }
	    
	      public void Month(String birthm)
	      {
	      driver.findElement(Month).sendKeys(birthm);
	      	
	      }
	      
	      public void Day(String birthd)
	      {
	      driver.findElement(Day).sendKeys(birthd);
	      	
	      }
	      
	      public void Year(String birthy)
	      {
	      driver.findElement(Year).sendKeys(birthy);
	      	
	      }
	      public void selectGender(String gender) {
	    	    if(gender.equals("Female")) {
	    	    driver.findElement(By.id("u_0_4")).click();	
	    	    	
	    	    }
	    	    else if(gender.equals("Male")) {
	    	    driver.findElement(By.id("u_0_5")).click();
	    	    }
	    	    else 
	    	    	driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
	    	    }



}





