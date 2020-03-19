package ArrayListDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayExample1 {

	public static void main(String[] args) 
	{
		 WebDriver driver = null;
		  String browser = "Chrome";
		  if (browser.equals("Chrome")) 
		  {
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/table.html");
		 
		  WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		  //To locate rows of table. 
		  List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
		    //To calculate no of rows In table.
		    int rows_count = rows_table.size();
		    //Loop will execute till the last row of table.
		    for (int row = 0; row < rows_count; row++) 
		    {
		       List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
		       //String []a = new String[row];
		      //Loop will execute till the last cell of that specific row.
		      for (int column = 1; column < 2; column++) 
		      {
		        // To retrieve text from that specific cell.
		        String celtext = Columns_row.get(column).getText();
		        int column_id = Integer.valueOf(celtext);
		        if(column_id==6)
		        {
		        	System.out.println("Test Passed No id available");
		        }
		        break;
		      }
		      
		      System.out.println("-------------------------------------------------- ");
		 }
		 }

	}

}
