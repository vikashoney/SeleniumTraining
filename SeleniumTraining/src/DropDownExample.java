import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = null;

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(5000);
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select datevalue= new Select(date);
		datevalue.selectByValue("24");
		//date.click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select monthvalue= new Select(month);
		monthvalue.selectByIndex(3);
		
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select yearvalue= new Select(year);
		yearvalue.selectByVisibleText("1989");
		
				
		}

	}

}
