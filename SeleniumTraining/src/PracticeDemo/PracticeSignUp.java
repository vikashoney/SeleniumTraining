package PracticeDemo;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSignUp {

	public static void main(String[] args) throws Exception {
		WebDriver driver=null;
		String browser= "Chrome";
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
			WebElement email_create= driver.findElement(By.xpath("//input[@id='email_create']")); 	
			email_create.sendKeys("vikas.honey70@gmail.com");
			//email_create.sendKeys(Keys.TAB); //Tab Key use
			
			//Thread.sleep(5000);
			WebElement submit_email=driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
			submit_email.click();	
			
			Thread.sleep(5000);
			WebElement gender=driver.findElement(By.xpath("//input[@id='id_gender1']"));
			gender.click();
			
			WebElement fname=driver.findElement(By.xpath("//input[@id='customer_firstname']"));
			fname.sendKeys("Sakavi");
			
			WebElement lname=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
			lname.sendKeys("Chitagare");
			
			WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
			password.sendKeys("sakavi2626");
			
			WebElement date=driver.findElement(By.xpath("//select[@id='days']"));
			Select datevalue=new Select(date);
			datevalue.selectByIndex(24);
			
			WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
			Select mont_value=new Select(month);
			mont_value.selectByValue("3");
			
			//Thread.sleep(5000);
			WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
			Select year_value=new Select(year);
			year_value.selectByValue("1989");
			
			WebElement offer=driver.findElement(By.xpath("//input[@id='optin']"));
			offer.click();
			
			WebElement afname=driver.findElement(By.xpath("//input[@id='firstname']"));
			afname.sendKeys("Sakavi");
			
			WebElement alname=driver.findElement(By.xpath("//input[@id='lastname']"));
			alname.sendKeys("Chitagare");
			
			WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
			company.sendKeys("DCompany");
			
			WebElement address=driver.findElement(By.xpath("//input[@id='address1']"));
			address.sendKeys("Flat-2, Kanchan Plaza, Mauli Nagar");
			
			WebElement address1=driver.findElement(By.xpath("//input[@id='address2']"));
			address1.sendKeys("Katraj-Kondhawa Road");
			
			WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
			city.sendKeys("Pune");
			
			WebElement country=driver.findElement(By.xpath("//select[@id='id_country']"));
			Select countryvalue=new Select(country);
			countryvalue.selectByVisibleText("United States");
			
			WebElement state=driver.findElement(By.xpath("//select[@id='id_state']"));
			Select statevalue=new Select(state);
			statevalue.selectByValue("32");
			
			WebElement pcode=driver.findElement(By.xpath("//input[@id='postcode']"));
			pcode.sendKeys("411046");
			
			
			
			WebElement ainfo=driver.findElement(By.xpath("//textarea[@id='other']"));
			ainfo.clear();
			ainfo.sendKeys("Address");
			
			WebElement hphone=driver.findElement(By.xpath("//input[@id='phone']"));
			hphone.sendKeys("9876543210");
			
			WebElement mphone=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
			mphone.sendKeys("2424567");
			
			WebElement haddress=driver.findElement(By.xpath("//input[@id='alias']"));
			haddress.clear();
			haddress.sendKeys("Home Address");
			
			//WebElement register=driver.findElement(By.xpath("//button[@id='submitAccount']"));
			//register.click();
		
			
		}
		//Thread.sleep(10000);
		//driver.close();
	}

}
