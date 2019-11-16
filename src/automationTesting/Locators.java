package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   // driver.get("https://login.yahoo.com/");
		driver.get("https://dashboard.diawi.com/login");
	    
	    //1.Id
	   
	 //WebElement Email=driver.findElement(By.id("_username")); 
	 //Email.sendKeys("mridul@test.com");
	 
	 //WebElemet Password=driver.findElements(By.id("_username"));
	 //Password.sendkeys("1234");
	
		
		
	   //2.Name
		//Thread.sleep(1000);
	  driver.findElement(By.name("_username")).sendKeys("mm@gmail.com");
	  
		
		//3.Xpath
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sinha.psnehal@gmail.com");
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sinha.psnehal@gmail.com");
		

		//4.css selector
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("sinha.psnehal@gmail.com");
	
		//5.Linktext: it is used only for link
		//driver.findElement(By.linkText("Learn more")).sendKeys("sinha.psnehal@gmail.com");
		//driver.findElement(By.linkText("Learn more")).click();
		
		//6.Class Name:
		//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")).sendKeys("jsjds@gmail.com");
		//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")).sendKeys("mridul@test.com");
	   
	   //7.PartialLink text
		//driver.findElement(By.partialLinkText("more")).sendKeys("mridul@test.com");
		
		//tag
	   
	    
	    
	    //driver.quit();
	    
	    
		

	}

}