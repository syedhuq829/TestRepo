package homeWorkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeHomePage {

WebDriver driver;


public AutomationPracticeHomePage(WebDriver driver) {
	
	this.driver = driver;
	
}
  
public void selectCategory(String category) {
    if(category.equals("Women")) {
    driver.findElement(By.linkText("Women")).click();	
    	
    }
    else if(category.equals("Dresses")) {
    driver.findElement(By.linkText("Dresses")).click();
    }
    else 
    	driver.findElement(By.linkText("T-shirts")).click();
    }
      
  
/*

    public WebElement Women() {
    	
    WebElement Women  = driver.findElement(By.xpath("//*[@title='Women']"));
    
    return Women;
    }

    public WebElement Dresses() {
    	
    WebElement Dresses  = driver.findElement(By.xpath("//*[@title='Dresses']"));
        
   return Dresses;
        }   */
    
}
