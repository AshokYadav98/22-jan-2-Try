package PopUpsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPractice {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.findElement(By.name("NewWindow")).click();
		 
		 Set<String> allIds = driver.getWindowHandles();
		 
		 System.out.println(allIds);
		 
		 Iterator<String> it = allIds.iterator();
		 
		 String mainPageId = it.next();
		 
		 String childPageId = it.next();
		 
		 driver.switchTo().window(childPageId);
		 
		 String ChildText = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
		 
		 Thread.sleep(1000);
		 
		 System.out.println("Text of child page "+ChildText);
		 

	}

}
