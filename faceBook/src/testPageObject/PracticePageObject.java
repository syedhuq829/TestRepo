package testPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticePageObject {

WebDriver driver;

public PracticePageObject(WebDriver driver) {
	
	this.driver = driver;
}
	public WebElement getfirstname() {
		
	WebElement firstname = driver.findElement(By.id("u_0_n"));
	return firstname;
	}
	
	public WebElement getlastname() {
	WebElement lastname = driver.findElement(By.id("u_0_p"));
	return lastname;
		
	}

    public WebElement getemail() {
    WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
    return email;
    	
    }

    public WebElement getpassword() {
    	
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
       
    public WebElement getbirthyear() {
    	
    WebElement birthyear = driver.findElement(By.xpath("//*[@id=\"year\"]"));
    return birthyear;
    }
 
  ////*[@id="u_0_z"]/div[1]
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
  
}