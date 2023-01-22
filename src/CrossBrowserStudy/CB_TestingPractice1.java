package CrossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB_TestingPractice1 
{
  WebDriver driver;
	
  @Parameters("Browsername")
  @Test
  public void crossBrowserTesting(String bname)
  {
	  
	  if(bname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  
		  
	  }
	  else if(bname.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "F:\\MY DOCUMENTS\\my new selenium file\\GeckodriverFirefox\\geckodriver.exe");
		  
	      driver =new FirefoxDriver();
		  
	  }
	  driver.get("https://www.facebook.com/");
	  
	  
	  
  }
}
