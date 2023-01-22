package PopUpsStudy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPr1 {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 driver.findElement(By.cssSelector("#alertButton")).click();
		 
		 Alert alt = driver.switchTo().alert();
		 
		 Thread.sleep(1000);
		 
		 alt.accept();
		 
		 //alt.dismiss(); To click on cancel button
		 
		 String alertText = alt.getText();
		 
		 System.out.println(alertText);
		
	}

}
