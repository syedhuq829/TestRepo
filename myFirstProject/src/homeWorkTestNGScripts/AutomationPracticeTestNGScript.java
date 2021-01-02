package homeWorkTestNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homeWorkTestNGPages.AutomationPracticeTesNGPage;

public class AutomationPracticeTestNGScript {

    WebDriver driver;
	
    AutomationPracticeTesNGPage AutoPracPage;
    
    @BeforeTest
    
    public void InitialSetUp() {
    	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipseWS\\Library\\chromedriver.exe");												
	driver   = new ChromeDriver();
	AutoPracPage = new AutomationPracticeTesNGPage(driver);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
	driver. manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }

    @Test(priority = 1)
    	
        public void HomePageValidation	() {
    	
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    	String Actualurl = driver.getCurrentUrl();
    	String Expectedurl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    	System.out.println("The current web page URL is: "+ Actualurl);
    	
    	Assert.assertEquals(Expectedurl, Actualurl);
    	
    	String ActualTitle = driver.getTitle();
    	String ExpectedTitle = "Login - My Store";
    	System.out.println("The web page title is: " + ActualTitle);
    	
    	Assert.assertEquals(ExpectedTitle, ActualTitle);
    	    	    	
        }
    	
    	@Test (priority = 2)
    	
    	public void SpecialPageValidation() {
    		
    	driver.findElement(By.linkText("Specials")).click();
    	String ActualSpurl = driver.getCurrentUrl();
    	String ExpectedSpurl = "http://automationpractice.com/index.php?controller=prices-drop";
    	System.out.println("The Specials link page URL is: "+ ActualSpurl);
    	Assert.assertEquals(ExpectedSpurl, ActualSpurl);
    	
    	String ActualSpTitle = driver.getTitle();
    	String ExpectedSpTitle = "Prices drop - My Store";
    	System.out.println("The Specials link page title is: " + ActualSpTitle);
    	
    	Assert.assertEquals(ExpectedSpTitle, ActualSpTitle);
    	    	   		
    	}
    
        @Test (priority = 3)
    
        public void NewProductsPageValidation() {
        	
        driver.findElement(By.linkText("New products")).click();
        String ActualNpurl = driver.getCurrentUrl();
        String ExpectedNpurl = "http://automationpractice.com/index.php?controller=new-products";
        System.out.println("The New products link page URL is: "+ ActualNpurl);
        
        Assert.assertEquals(ExpectedNpurl, ActualNpurl);
          
        String ActualNpTitle = driver.getTitle();
        String ExpectedNpTitle = "New products - My Store";
        System.out.println("The New products link page title is: " + ActualNpTitle);
        
        Assert.assertEquals(ExpectedNpTitle, ActualNpTitle);
                
        }
    
        @Test (priority = 4)
        
        public void BestsellersPageValidation() {
        	
        driver.findElement(By.linkText("Best sellers")).click();
        String ActualBsurl = driver.getCurrentUrl();
        String ExpectedBsurl = "http://automationpractice.com/index.php?controller=best-sales";
        System.out.println("The Best sellers link page URL is: "+ ActualBsurl);
        
        Assert.assertEquals(ExpectedBsurl, ActualBsurl);
          
        String ActualBsTitle = driver.getTitle();
        String ExpectedBsTitle = "Best sales - My Store";
        System.out.println("The Best sellers link page title is: " + ActualBsTitle);
        
        Assert.assertEquals(ExpectedBsTitle, ActualBsTitle);
                
        }

        @Test (priority = 5)
        
        public void OurstoresPageValidation() {
        	
        driver.findElement(By.linkText("Our stores")).click();
        String ActualOsurl = driver.getCurrentUrl();
        String ExpectedOsurl = "http://automationpractice.com/index.php?controller=stores";
        System.out.println("The Our stores link page URL is: "+ ActualOsurl);
        
        Assert.assertEquals(ExpectedOsurl, ActualOsurl);
          
        String ActualOsTitle = driver.getTitle();
        String ExpectedOsTitle = "Stores - My Store";
        System.out.println("The Our stores link page title is: " + ActualOsTitle);
        
        Assert.assertEquals(ExpectedOsTitle, ActualOsTitle);
                
        }
     
        @Test (priority = 6)
        
        public void ContactusPageValidation() {
        	
        driver.findElement(By.linkText("Contact us")).click();
        String ActualCourl = driver.getCurrentUrl();
        String ExpectedCourl = "http://automationpractice.com/index.php?controller=contact";
        System.out.println("The Contact us link page URL is: "+ ActualCourl);
        
        Assert.assertEquals(ExpectedCourl, ActualCourl);
          
        String ActualCoTitle = driver.getTitle();
        String ExpectedCoTitle = "Contact us - My Store";
        System.out.println("The Contact us link page title is: " + ActualCoTitle);
        
        Assert.assertEquals(ExpectedCoTitle, ActualCoTitle);
                
        }

        @Test (priority = 7)
        
        public void TermsandconditionsofusePageValidation() {
        	
        driver.findElement(By.linkText("Terms and conditions of use")).click();
        String ActualTcurl = driver.getCurrentUrl();
        String ExpectedTcurl = "http://automationpractice.com/index.php?id_cms=3&controller=cms";
        System.out.println("The Terms and conditions of use link page URL is: "+ ActualTcurl);
        
        Assert.assertEquals(ExpectedTcurl, ActualTcurl);
          
        String ActualTcTitle = driver.getTitle();
        String ExpectedTcTitle = "Terms and conditions of use - My Store";
        System.out.println("The Terms and conditions of use link page title is: " + ActualTcTitle);
        
        Assert.assertEquals(ExpectedTcTitle, ActualTcTitle);
                
        }

        @Test (priority = 8)
        
        public void AboutusPageValidation() {
        	
        driver.findElement(By.linkText("About us")).click();
        String ActualAusurl = driver.getCurrentUrl();
        String ExpectedAusurl = "http://automationpractice.com/index.php?id_cms=4&controller=cms";
        System.out.println("The About us link page URL is: "+ ActualAusurl);
        
        Assert.assertEquals(ExpectedAusurl, ActualAusurl);
          
        String ActualAuTitle = driver.getTitle();
        String ExpectedAuTitle = "About us - My Store";
        System.out.println("The About us link page title is: " + ActualAuTitle);
        
        Assert.assertEquals(ExpectedAuTitle, ActualAuTitle);
                
        }

        @Test (priority = 9)
        
        public void SitemapPageValidation() {
        	
        driver.findElement(By.linkText("Sitemap")).click();
        String ActualSmurl = driver.getCurrentUrl();
        String ExpectedSmurl = "http://automationpractice.com/index.php?controller=sitemap";
        System.out.println("The Sitemap link page URL is: "+ ActualSmurl);
        
        Assert.assertEquals(ExpectedSmurl, ActualSmurl);
          
        String ActualAuTitle = driver.getTitle();
        String ExpectedAuTitle = "Sitemap - My Store";
        System.out.println("The Sitemap link page title is: " + ActualAuTitle);
        
        Assert.assertEquals(ExpectedAuTitle, ActualAuTitle);
                
        }


}

