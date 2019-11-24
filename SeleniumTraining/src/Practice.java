//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//WebElement email=driver.findElement(By.id("email"));
		//	email.getSize();
           // System.out.println(driver.manage().window());
	//	WebElement day= driver.findElement(By.xpath("//select[@id=\\\"day\\']"));
		
		}

	}

}
