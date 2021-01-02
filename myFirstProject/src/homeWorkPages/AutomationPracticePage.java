package homeWorkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

     public class AutomationPracticePage {

     WebDriver driver;

     public AutomationPracticePage(WebDriver driver) {
	
     this.driver = driver;	 
	
	 }

     public WebElement getEmail() {
    	 
     WebElement Email = driver.findElement(By.xpath("//*[@id='email_create']"));
     
     return Email;
     }
     
     public WebElement toCreateAcct() {
    	 
     WebElement CreateAcct = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
     
     return CreateAcct;
     }
     
     public void selectGender(String title) {
     if(title.equals("Mr")) {
     driver.findElement(By.xpath("//*[@for='id_gender1']")).click();	
     }
    
     else 
     driver.findElement(By.xpath("//*[@for='id_gender2']")).click();
     
     }
     
     public WebElement getfirstName() {
    	 
     WebElement firstName = driver.findElement(By.id("customer_firstname"));
     
     return firstName;
     }
    
     public WebElement getlastName() {
    	 
     WebElement lastName= driver.findElement(By.xpath("//*[@id='customer_lastname']"));
     
     return lastName;
     }
     
     public WebElement getPassword() {
    	 
     WebElement Password = driver.findElement(By.xpath("//*[@type='password']"));
     
     return Password;
     }
     
     public void setdays(String days){
		    
	 WebElement dropdown = driver.findElement(By.xpath("//*[@name='days']"));
	 Select daysSelect = new Select(dropdown);
	 daysSelect.selectByValue(days);
	 }
     
     public void setmonth(String month){
		    
	 WebElement dropdown = driver.findElement(By.xpath("//*[@name='months']"));
	 Select monthSelect = new Select(dropdown);
	 monthSelect.selectByValue(month);
	 }
     
     public void setyear(String year){
		    
	 WebElement dropdown = driver.findElement(By.xpath("//*[@name='years']"));
	 Select yearSelect = new Select(dropdown);
	 yearSelect.selectByValue(year);
	 }
     
     public WebElement getNewsLtr() {
    	 
     WebElement NewsLtr = driver.findElement(By.xpath("//*[@for='newsletter']"));
     
     return NewsLtr;
     }
     
     public WebElement getSpecialOff() {
    	 
     WebElement SpecialOff = driver.findElement(By.xpath("//*[@for='optin']"));
     
     return SpecialOff;
     }
     
     }
