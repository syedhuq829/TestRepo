package homeWorkTestNGPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpTravels_SignUpPage {


	public WebDriver driver;

    public PhpTravels_SignUpPage(WebDriver driver) {
	
    this.driver = driver;	
	
 }

    public WebElement getfirstName() {
	
	 WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
	 
	 return firstName;
	   
 }

    public WebElement getlastName() {
   	 
    WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
    
    return lastName;
   	 
    }

    public WebElement getmobileNumber() {
   	 
    WebElement mobileNumber = driver.findElement(By.xpath("//*[@name='phone']"));
    
    return mobileNumber;
   	 
    }
    
    
    public WebElement getEmail() {
   	 
    WebElement Email = driver.findElement(By.xpath("//*[@name='email']"));
    
    return Email;
   	 
    }

    public WebElement getpassWord() {
   	 
    WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));
    
    return passWord;
   	
    }

    public WebElement getconfirmPassWord() {
   	 
    WebElement confirmPassWord = driver.findElement(By.xpath("//*[@name='confirmpassword']"));
    
    return confirmPassWord;
   	 
    }

    public WebElement clickSubmitbutton() {
    	
    WebElement Submitbutton = driver.findElement(By.xpath("//*[@type=['submit']"));
    
    return Submitbutton;   }
}





