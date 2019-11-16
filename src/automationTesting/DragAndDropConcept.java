package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://jqueryui.com/droppable/");
        
        
        driver.switchTo().frame(0);//Switch to Iframe
        Actions action=new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']/p")))
        .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
        //driver.close();
    

	
	}

	}


