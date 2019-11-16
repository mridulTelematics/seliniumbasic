package automationTesting;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
//import com.sun.jna.platform.win32.Netapi32Util.User;

import org.openqa.selenium.*;		

public class Form {				
    public static void main(String[] args) 
    		throws InterruptedException 
    {									
    		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        
        
        String baseUrl = "http://103.231.78.202/TestJiovts";					
        driver.get(baseUrl);					
      
        
        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement txtLoginID = driver.findElement(By.id("txtLoginID"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));							

        txtLoginID.sendKeys("JioDevices");					
        txtPassword.sendKeys("Jio@1234");					
        System.out.println("Text Field Set");					
        
        // Deleting values in the text box		
       //txtLoginID.clear();			
      //txtPassword.clear();			
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement Login = driver.findElement(By.id("btnlogin"));							
                    		
        // Using click method to submit form		
        txtLoginID.sendKeys("JioDevices");					
        txtPassword.sendKeys("Jio@1234");					
        Login.click();
      			
        System.out.println("Login Done with Click");					
        		
        //using submit method to submit the form. Submit used on password field		
        //driver.get(baseUrl);					
        driver.findElement(By.id("txtLoginID")).sendKeys("JioDevices");							
        driver.findElement(By.id("txtPassword")).sendKeys("Jio@1234");							
        driver.findElement(By.id("btnlogin")).submit();	    
        System.out.println("Login Done with Submit");
        
         Thread.sleep(1000);
         
		//driver.close();
            
    }		
}