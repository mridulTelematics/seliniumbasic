package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\eclipse\\chromedriver_win32\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        
        
        String baseUrl = "http://103.231.78.202/TestJiovts";					
        driver.get(baseUrl);
        WebElement txtLoginID = driver.findElement(By.name("txtLoginID"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));							

        txtLoginID.sendKeys("JioDevices");					
        txtPassword.sendKeys("Jio@1234");					
        System.out.println("Text Field Set");	
        WebElement Login = driver.findElement(By.id("btnlogin"));
        Login.click();
        
        //driver.get("http://103.231.78.202/TestJIOVTS/Reports/alertsacknowledgereport.aspx#");
        Actions action = new Actions(driver);
        
     
	      
	     //action.moveToElement(driver.findElement(By.id("e0_5i"))).build().perform();
	       //action.moveToElement(driver.findElement(By.id("e0_4i"))).build().perform();
	       //action.moveToElement(driver.findElement(By.id("e0_5i"))).build().perform();
			//driver.findElement(By.id("e0_5i")).click();
			
			//action.moveToElement(driver.findElement(By.partialLinkText("Dashboard"))).build().perform();
		      // action.moveToElement(driver.findElement(By.partialLinkText("./Geofencewisetracking.aspx"
		    	//))).build().perform();
				//driver.findElement(By.linkText("./Geofencewisetracking.aspx")).click();			
				
				
				
			
		}

	
	
	}


