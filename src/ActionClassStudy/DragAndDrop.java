package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement Desti = driver.findElement(By.cssSelector("#amt8"));
		
		Actions act =new Actions(driver);
		
		Thread.sleep(1000);
		
		//act.moveToElement(Source).clickAndHold().release(Desti).build().perform();
		
		act.dragAndDrop(Source, Desti).perform();

	}

}
