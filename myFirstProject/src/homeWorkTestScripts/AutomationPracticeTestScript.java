package homeWorkTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import homeWorkPages.AutomationPracticePage;


    public class AutomationPracticeTestScript {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	
	AutomationPracticePage AutoPracP;
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Syeda\\Downloads\\eclipse\\Library\\chromedriver.exe");												
	driver   = new ChromeDriver();
	AutoPracP = new AutomationPracticePage(driver);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
	driver. manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	AutoPracP.getEmail().sendKeys("Test99@TestAuto.com");
	AutoPracP.toCreateAcct().click();
	AutoPracP.selectGender("Mr");
	AutoPracP.getfirstName().sendKeys("Mark");
	AutoPracP.getlastName().sendKeys("Gamble");
	AutoPracP.getPassword().sendKeys("Test#30");
	AutoPracP.setdays("30");
	AutoPracP.setmonth("4");
	AutoPracP.setyear("1983");
	AutoPracP.getNewsLtr().click();
	AutoPracP.getSpecialOff().click();
	
	Thread.sleep(8000);
	
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	String url = driver.getCurrentUrl();
	System.out.println("The current page URL is: "+ url);
	
	String AutoAcct = driver.getTitle();
	System.out.println("The page title is: " + AutoAcct);
	
	WebElement Signin = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	 
	String strg = Signin.getText();
	 
	System.out.println(strg);
	
	boolean SigninDispaly = Signin.isDisplayed();
	 
	System.out.println(SigninDispaly);
	 
	boolean SigninEnable = Signin.isEnabled();
	 
	System.out.println(SigninEnable); 
	
	
	driver.findElement(By.linkText("Specials")).click();
    String spurl = driver.getCurrentUrl();
    System.out.println("The Specials link page URL is: "+ spurl);
    String sptitle = driver.getTitle();
	System.out.println("The Specials link page title is: " + sptitle);
    
	driver.findElement(By.linkText("New products")).click();
    String npurl = driver.getCurrentUrl();
    System.out.println("The New products link page URL is: "+ npurl);
    String nptitle = driver.getTitle();
	System.out.println("The New products link page title is: " + nptitle);
    
	driver.findElement(By.linkText("Best sellers")).click();
    String bsurl = driver.getCurrentUrl();
    System.out.println("The Best sellers link page URL is: "+ bsurl);
    String bstitle = driver.getTitle();
	System.out.println("The Best sellers link page title is: " + bstitle);
    
	driver.findElement(By.linkText("Our stores")).click();
	String osurl = driver.getCurrentUrl();
    System.out.println("The Our stores link page URL is: "+ osurl);
    String ostitle = driver.getTitle();
	System.out.println("The Our stores link page title is: " + ostitle);
    
	driver.findElement(By.linkText("Contact us")).click();
    String cusurl = driver.getCurrentUrl();
    System.out.println("The Contact us link page URL is: "+ cusurl);
    String custitle = driver.getTitle();
	System.out.println("The Contact us link page title is: " + custitle);
    
	driver.findElement(By.linkText("Terms and conditions of use")).click();
	String tacurl = driver.getCurrentUrl();
    System.out.println("The Terms and conditions of use link page URL is: "+ tacurl);
    String tactitle = driver.getTitle();
	System.out.println("The Terms and conditions of use link page title is: " + tactitle);
    
	driver.findElement(By.linkText("About us")).click();
    String abuurl = driver.getCurrentUrl();
    System.out.println("The About us link page URL is: "+ abuurl);
    String abutitle = driver.getTitle();
	System.out.println("The About us link page title is: " + abutitle);
    
	driver.findElement(By.linkText("Sitemap")).click();
	String smpurl = driver.getCurrentUrl();
    System.out.println("The Sitemap link page URL is: "+ smpurl);
    String smptitle = driver.getTitle();
	System.out.println("The Sitemap link page title is: " + smptitle);
	
	Thread.sleep(4000);
	
	driver.close();
	
	}

}
