package automationTesting;



	import org.openqa.selenium.chrome.ChromeDriver;

	public class webdrivercodeex1 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kazim\\Desktop\\IMP FOLDER\\selinuem\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			//WebDriver driver=new ChromeDriver();//Launch browser
			driver.get("http://49.40.30.11/auth/login");
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.equals("JioTelematics"))
			{
				System.out.println("We are in correct title");
			}
			else {
				System.out.println("we are in not a correct title");
			}
			
			
			String curenturl=driver.getCurrentUrl();
			System.out.println(curenturl);
			if(curenturl.contains("http://49.40.30.11/auth/login"))
			{
				System.out.println("correct current url");
			}
			else{
				System.out.println("not correct current url");
			}
			
			//System.out.println(driver.getWindowHandle());
			
			//System.out.println(driver.getPageSource());
			//driver.quit();
		}

	}
