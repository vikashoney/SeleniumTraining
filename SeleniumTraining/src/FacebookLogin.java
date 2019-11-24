import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = null;
        
		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("9765627776");
			WebElement pass=driver.findElement(By.id("pass"));
            pass.sendKeys("262626");
			WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));
			login.click();
           
			Thread.sleep(5000);
			WebElement toggle= driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
			toggle.click();
			
			

		}
	}

}
