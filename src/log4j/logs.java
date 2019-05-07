package log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class logs {
	//WebDriver driver;
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
     Loggingin.writelog("logs", "debug", "browser is successfully opened");   
     
       driver.get("https://www.google.com/");
     Loggingin.writelog("logs", "info", "Google URL is open");
             
    }

	
}