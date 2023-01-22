package PopUpsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenbrowserPopUpStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://www.flipkart.com/");
		
		WebElement crossmark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
		
		w.until(ExpectedConditions.elementToBeClickable(crossmark));
		
		crossmark.click();
		
		driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max");
		
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		
		Thread.sleep(1000);
		
		WebElement review = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[6]"));
		
		System.out.println("Total no of reviews are"+review.getText());
		
		
	}

}
