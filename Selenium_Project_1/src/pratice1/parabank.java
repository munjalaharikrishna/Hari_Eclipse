package pratice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parabank {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
		
		driver.findElement(By.id("customer.firstName")).sendKeys("mhk");
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("name");
		driver.findElement(By.name("customer.address.street")).sendKeys("kphb");
		driver.findElement(By.id("customer.address.city")).sendKeys("hnk");
		driver.findElement(By.name("customer.address.state")).sendKeys("pppt");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("kkk"); 
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("rrr");
		driver.findElement(By.name("customer.ssn")).sendKeys("bro");
		driver.findElement(By.name("customer.username")).sendKeys("abc");
		driver.findElement(By.name("customer.password")).sendKeys("abc");
		driver.findElement(By.name("repeatedPassword")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		
		
		
//		driver.findElement(By.name("username")).sendKeys("selenium");
//		driver.findElement(By.name("password")).sendKeys("selenium");
//		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();	
//		
		String s = driver.getTitle();
		System.out.println(s);
		
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"type\"]"));
		List<WebElement> k = dd.findElements(By.tagName("option"));
		for(int m= 0; m<=k.size()-1; m++) {
			
			System.out.println(k.get(m).getText());
		}
		
		Select j = new Select(dd);
		j.selectByVisibleText("SAVINGS");
	
		WebElement  t = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[2]"));
		List<WebElement> b = t.findElements(By.tagName("option"));
        for(int x = 0; x<=b.size()-1; x++) {
			
			System.out.println(b.get(x).getText());
		}
		Select q = new Select(t);
		q.selectByIndex(1);
		//driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
	
	}

}
