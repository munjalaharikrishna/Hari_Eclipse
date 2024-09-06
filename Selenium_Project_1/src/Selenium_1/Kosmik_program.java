package Selenium_1;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kosmik_program {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			
//		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/master.php");
//		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("kosmik");
//		driver.findElement(By.name("password")).sendKeys("kosmik");
//		driver.findElement(By.name("submit")).click();
//		
//		
//		driver.findElement(By.linkText("Registration")).click();
//		
//		WebElement dd = driver.findElement(By.name("PATIENT_CAT"));
//		List<WebElement> h = dd.findElements(By.tagName("option"));
//		System.out.println(h.size());
//		for(int i = 0; i<=h.size()-1; i++)
//		{
//			System.out.println(h.get(i).getText());
//		}
//		
//		System.out.println("                                                   ");
//		
//		for(int m= h.size()-1; m>=0; m--)
//		{
//			System.out.println(h.get(m).getText());
//		}
//		
//		
//		
//		
		
//		Select s = new Select(dd);
//		s.selectByVisibleText("Self");
//		
//		WebElement m = driver.findElement(By.name("TITLE"));
//		Select a = new Select(m);
//		a.selectByVisibleText("Mr.");
//		
//		driver.findElement(By.name("PNT_NAME")).sendKeys("Hari");
//		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Krishna");
//		driver.findElement(By.name("LAST_NAME")).sendKeys("Munjala");
//		driver.findElement(By.name("DOB")).sendKeys("18/07/1999");
//		driver.findElement(By.name("AGE")).sendKeys("24");
//		
//		WebElement d = driver.findElement(By.name("SEX"));
//		Select c = new Select(d);
//		c.selectByVisibleText("Male");
//		
//		WebElement k = driver.findElement(By.name("MTRL_STATUS"));
//		Select o = new Select(k);
//		o.selectByVisibleText("Single");
//		
//		WebElement e = driver.findElement(By.name("RELIGION"));
//		Select b = new Select(e);
//		b.selectByVisibleText("Hindu");
//		
//		WebElement f = driver.findElement(By.name("PLANGUAGE"));
//		Select i = new Select(f);
//		i.selectByVisibleText("English");
//				
//		WebElement j = driver.findElement(By.name("RELATION"));
//		Select l = new Select(j);
//		l.selectByVisibleText("Father");
//		
//		driver.findElement(By.name("MOTHER_NAME")).sendKeys("hari");
//		
//		WebElement n = driver.findElement(By.name("PAT_IDENTITY"));
//		Select p = new Select(n);
//		p.selectByVisibleText("AAdhar Card");
//		
//		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456789");
//		
//		WebElement q = driver.findElement(By.name("NATIONALITY"));
//		Select r = new Select(q);
//		r.selectByVisibleText("Indian");
//		
//		WebElement u = driver.findElement(By.name("NATIONALITY"));
//		Select t = new Select(u);
//		t.selectByVisibleText("Indian");
//		
//		WebElement w = driver.findElement(By.name("IS_MLC"));
//		Select x = new Select(w);
//		x.selectByVisibleText("Yes");
//		
		
		
   }

}
