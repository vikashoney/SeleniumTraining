package PracticeDemo;

//import java.awt.AWTException;
//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_fileUpload {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		StringSelection select=new StringSelection("C:\\Users\\vdhanorkar\\Desktop\\Errors.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Robot robot=new Robot();
		
		driver.get("https://www.monsterindia.com/seeker/personal");
		
		WebElement exp= driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div/div/div[2]/div[1]/div/div[2]/div"));
		exp.click();
		
		WebElement btn_browse= driver.findElement(By.xpath("//*[@id='file-upload']"));		
		btn_browse.click();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.close();
		//driver.
		
	}

}
