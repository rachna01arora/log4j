package log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.logname;

public class logtest {
	WebDriver driver;
	
	  @BeforeClass
		public void starttest(){
			logname.startLog();
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
	}

  @Test
  
	  public void testcase1(){
			driver.get("https://www.google.com/");
			logname.info("Successfully opened the URL");
			logname.debug("debug");
			
  }
  
}
