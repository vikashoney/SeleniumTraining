import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

		WebDriver driver = null;

		String browser = "IE";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumDrivers\\IEDriverServer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

//driver.close();

	}

}
