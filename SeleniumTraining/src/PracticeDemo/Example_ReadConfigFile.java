package PracticeDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ReadConfigFile {
	
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Properties prop=new Properties();
		
		File file =new File("./ConfigrationDemo/config.property");
		FileInputStream fio;
		try
		{
		   fio=new FileInputStream(file); 		
		   prop.load(fio);   
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Facebook_Url"));
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(prop.getProperty("fb_username"));
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(prop.getProperty("fb_password"));
		WebElement btn_login=driver.findElement(By.xpath("//*[@id='u_0_2']"));
		btn_login.click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
