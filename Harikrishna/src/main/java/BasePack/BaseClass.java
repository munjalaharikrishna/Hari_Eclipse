package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	public static WebDriver driver;
  @BeforeMethod
  public void open() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  
	  
	  
  }
}
