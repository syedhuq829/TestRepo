package homeWorkTestNGPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeTesNGPage {

    WebDriver driver;

    public  AutomationPracticeTesNGPage(WebDriver driver) {
	
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
    
}
