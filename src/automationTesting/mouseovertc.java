package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseovertc {

	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	      driver.get("http://103.231.78.202/TestJIOVTS/Sitemonitoring/Sitemonitoring.aspx#");
	      Actions action = new Actions(driver);
	      
	      
	     // action.moveToElement(driver.findElement(By.xpath("//*[@id=\'menu-item-141975\']/a"))).build().perform();
	       action.moveToElement(driver.findElement(By.partialLinkText("Dashboard"))).build().perform();
			driver.findElement(By.linkText("Site Monitoring")).click();
		}

	}
	


