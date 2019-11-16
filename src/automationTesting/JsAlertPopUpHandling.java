package automationTesting;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException //throws InterruptedException
	{
		//How to handle alert:using alert API in selenium
		//alert API is available in form of alert interface
		//Accept,dismiss,gettext
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
				System.out.println(text);
				alert.accept();
				if(text.equals("Please enter a valid user ")){
					System.out.println("correct msg");
				}
				else{
					System.out.println("not correct msg"); 
				}
				//cancel
		//alert.dismiss();*/
		
		
		
		
		
		

	}

}
