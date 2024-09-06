package Selenium_1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic_program {

	public static void main(String[] args) throws FileNotFoundException, AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a"))).perform();
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		driver.findElement(By.name("txtEmployeeId")).clear();
		driver.findElement(By.name("txtEmployeeId")).sendKeys("hari");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("krishna");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("krishna");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("munjala");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("hari");
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		StringSelection s = new StringSelection("C:\\Users\\Dell\\Downloads\\Jmetre\\AD_TESTING.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(2000);
		 
		Robot r = new Robot();
				
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
			

	}

}
