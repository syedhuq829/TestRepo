package homeWork3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");
		 driver   = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver. manage().window().maximize();
		 driver.get("http://automationpractice.com/");
		 String url = driver.getCurrentUrl();
		 System.out.println("The home page URL is: "+ url);
		 Thread.sleep(4000);
		 
		// driver.navigate().back();
		// Thread.sleep(4000);
		 
		 //driver.findElement(By.xpath("//*[@title='Women']")).click();
		 
		 driver.findElement(By.linkText("Women")).click();
		 
		// driver.findElement(By.xpath("//*[@title='Tops']")).click();
		// driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
		 
		 //Select methoddd = new Select(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
	     //   methoddd.selectByVisibleText("Dresses").click();
		 
/*		 public void selectcategory(String category) {
             if(category.equals("Women")) {
             driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();	
             	
             }
             else if(category.equals("Dresses")) {
             driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
             }
             else 
             	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
             }
		 */
		 
		 
		 driver.findElement(By.xpath("//*[@title='Women']")).click();
		 
		 //Thread.sleep(4000);
		 
		 //driver.findElement(By.linkText("T-shirts")).click();
		 
		 Thread.sleep(4000);

	/*
		 driver.findElement(By.linkText("Specials")).click();
         String spurl = driver.getCurrentUrl();
	     System.out.println("The Specials link page URL is: "+ spurl);
	     
		 driver.findElement(By.linkText("New products")).click();
		 String npurl = driver.getCurrentUrl();
	     System.out.println("The New products link page URL is: "+ npurl);
	     
		 driver.findElement(By.linkText("Best sellers")).click();
		 String bsurl = driver.getCurrentUrl();
	     System.out.println("The Best sellers link page URL is: "+ bsurl);
	     
		 driver.findElement(By.linkText("Our stores")).click();
		 String osurl = driver.getCurrentUrl();
	     System.out.println("The Our stores link page URL is: "+ osurl);
	     
		 driver.findElement(By.linkText("Contact us")).click();
         String cusurl = driver.getCurrentUrl();
         System.out.println("The Contact us link page URL is: "+ cusurl);
         
		 driver.findElement(By.linkText("Terms and conditions of use")).click();
		 String tacurl = driver.getCurrentUrl();
	     System.out.println("The Terms and conditions of use link page URL is: "+ tacurl);
	     
		 driver.findElement(By.linkText("About us")).click();
         String abuurl = driver.getCurrentUrl();
	     System.out.println("The About us link page URL is: "+ abuurl);
	     
		 driver.findElement(By.linkText("Sitemap")).click();
		 String smpurl = driver.getCurrentUrl();
	     System.out.println("The Sitemap link page URL is: "+ smpurl);
		
		 */
 
         java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
         
         System.out.println(links.size());
         
         for (int i = 1; i<=links.size(); i=i+1)
         
         {
         
         System.out.println(links.get(i).getText());
         
         } 
  
		 Thread.sleep(2000);
/*
// Link-Specials
		 driver.findElement(By.linkText("Specials")).click();
	    
         String spurl = driver.getCurrentUrl();
	     
         System.out.println("The Specials link page URL is: "+ spurl);
		 
		 String sptitle = driver.getTitle();
		   
		 System.out.println("The Specials link page title is: " + sptitle);
		 Thread.sleep(2000); 
		 
		 driver.navigate().back();
	 
// Link-New products 
				 driver.findElement(By.linkText("New products")).click();
			    
		         String npurl = driver.getCurrentUrl();
			     
		         System.out.println("The New products link page URL is: "+ npurl);
				 
				 String nptitle = driver.getTitle();
				   
				 System.out.println("The New products link page title is: " + nptitle);
				 Thread.sleep(2000); 
				 
				 driver.navigate().back();   
		 
// Link-Best sellers 
				 driver.findElement(By.linkText("Best sellers")).click();
			    
		         String bsurl = driver.getCurrentUrl();
			     
		         System.out.println("The Best sellers link page URL is: "+ bsurl);
				 
				 String bstitle = driver.getTitle();
				   
				 System.out.println("The Best sellers link page title is: " + bstitle);
				 Thread.sleep(2000); 
				 
				 driver.navigate().back();			 
		 
// Link-Our stores 
				 driver.findElement(By.linkText("Our stores")).click();
			    
		         String osurl = driver.getCurrentUrl();
			     
		         System.out.println("The Our stores link page URL is: "+ osurl);
				 
				 String ostitle = driver.getTitle();
				   
				 System.out.println("The Our stores link page title is: " + ostitle);
				 Thread.sleep(2000); 
				 
				 driver.navigate().back();		
		 
// Link-Contact us 
		 driver.findElement(By.linkText("Contact us")).click();
	    
         String cusurl = driver.getCurrentUrl();
	     
         System.out.println("The Contact us link page URL is: "+ cusurl);
		 
		 String custitle = driver.getTitle();
		   
		 System.out.println("The Contact us link page title is: " + custitle);
		 Thread.sleep(2000); 
		 
		 driver.navigate().back();	  
		 
// Link-Terms and conditions of use 
				 driver.findElement(By.linkText("Terms and conditions of use")).click();
			    
		         String tacurl = driver.getCurrentUrl();
			     
		         System.out.println("The Terms and conditions of use link page URL is: "+ tacurl);
				 
				 String tactitle = driver.getTitle();
				   
				 System.out.println("The Terms and conditions of use link page title is: " + tactitle);
				 Thread.sleep(2000); 
				 
				 driver.navigate().back();	

// Link-About us
		 driver.findElement(By.linkText("About us")).click();
	    
         String abuurl = driver.getCurrentUrl();
	     
         System.out.println("The About us link page URL is: "+ abuurl);
		 
		 String abutitle = driver.getTitle();
		   
		 System.out.println("The About us link page title is: " + abutitle);
		 Thread.sleep(2000); 
		 
		 driver.navigate().back();	  
		 
// Link-Sitemap
				
				 driver.findElement(By.linkText("My account")).click();
				 
				 driver.findElement(By.linkText("Sitemap")).click();
			    
		         String smpurl = driver.getCurrentUrl();
			     
		         System.out.println("The Sitemap link page URL is: "+ smpurl);
				 
				 String smptitle = driver.getTitle();
				   
				 System.out.println("The Sitemap link page title is: " + smptitle);
				 Thread.sleep(2000); 
				 
				 driver.navigate().back();	*/
		 
		         driver.close();
		 
	
	}

}
