package homeWorkPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	public class yahooSignUpPage {

		WebDriver driver;
		
		public yahooSignUpPage (WebDriver driver) {
			
		this.driver = driver;	
		
		}

		public WebElement getfirstName() {
		
			WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
			
			return firstName;
		}
		
		public WebElement getlastName() {
			
			WebElement lastName = driver.findElement(By.name("lastName"));
			
			return lastName;
		}
		
		public WebElement getEmail() {
			
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
			
			return Email;
		}
		
		public WebElement getPassword() {
			
			WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
			
			return Password;
		}
		
		    public void setcountryCode(String countryCode) {
		    	
		    WebElement countryPhCode = driver.findElement(By.name("shortCountryCode"));	
		    Select countryCodeSelect = new Select(countryPhCode);
		    countryCodeSelect.selectByValue(countryCode);
		    
		    }
		    
		    public WebElement getphoneNumber() {
		    
		    WebElement phoneNumber = driver.findElement(By.name("phone"));
		    
		    return phoneNumber;
		    
		    }
		
		    public void setmonth(String month){
		    
		    WebElement dropdown = driver.findElement(By.xpath("//select[@name='mm']"));
		    Select monthSelect = new Select(dropdown);
		    monthSelect.selectByValue(month);
		    }
		    
		    public WebElement getbirthday() {
		    	
		    WebElement birthday = driver.findElement(By.name("dd"));
		  
		    return birthday;
		    }
		       
		    public WebElement getbirthyear() {
		    	
		    WebElement birthyear = driver.findElement(By.name("yyyy"));
		    return birthyear;
		    }
		
		    public WebElement getGender() {
		    	
		    WebElement Gender = driver.findElement(By.xpath("//*[@id=\"usernamereg-freeformGender\"]"));
		    
		    return Gender;
		    	
		    }
	}









