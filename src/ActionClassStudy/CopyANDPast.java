package ActionClassStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyANDPast {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get(("https://www.facebook.com/"));
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	     
	     WebElement Firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    
	     WebElement Lastname = driver.findElement(By.name("lastname"));
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    // Firstname.sendKeys("Ashok");
	     
	     Actions act=new Actions(driver);
//	     
//	     act.keyDown(Firstname, Keys.CONTROL).sendKeys("A").sendKeys("X").build().perform();
//	     
//	     act.keyDown(Lastname, Keys.CONTROL).sendKeys("V").build().perform();
//	     
//	     //=======================================================================//
	     
	     WebElement Password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	     
	     Thread.sleep(1000);
	     
	     act.keyDown(Firstname, Keys.SHIFT).sendKeys("ashok").build().perform();
	     
	     //=====================================================================================//
	     
	     WebElement dropDown = driver.findElement(By.cssSelector("#day"));
	     
	     act.click(dropDown).perform();
	     
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).build().perform();
//	     Thread.sleep(1000);
//	     
//	     act.sendKeys(Keys.ENTER).build().perform();
//	     
	     
	     
	     for(int i=1;i<=6;i++)
	     {
	    	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	    	 Thread.sleep(1000);
	     }
	     act.sendKeys(Keys.ENTER).build().perform();
	     
	
	
	
	
	}

}
