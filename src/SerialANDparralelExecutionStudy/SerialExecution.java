package SerialANDparralelExecutionStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialExecution {
  @Test
  public void MyTest1() 
  {

	  System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	//  driver.manage().window().maximize();
	  
	  driver.get("https://pmkisan.gov.in/");
	  
  }
  @Test
  public void MyTest2()
  {

	  System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	//  driver.manage().window().maximize();
	  
	  driver.get("https://paytm.com/");
	  
  }
}
