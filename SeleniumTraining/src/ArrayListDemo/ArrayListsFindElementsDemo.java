package ArrayListDemo;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListsFindElementsDemo {

	public static void main(String[] args) {
		WebDriver driver = null;
        
		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			
			
            List<WebElement> links= driver.findElements(By.tagName("a"));
            System.out.println(links.size());
            for(int i=0; i<links.size();i++)
            {
            	WebElement linkCount= links.get(i);
            	String str=linkCount.getAttribute("href");  
            	System.out.println(str);           
            	System.out.println(linkCount.getText());
            }
            driver.close();
		}
	}

}
