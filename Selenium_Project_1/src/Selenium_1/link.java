package Selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("url");
	
	String s = driver.getTitle();
	
	if (s.equals("title")) {
		
		System.out.println("title is validated");
	}
	else {
		
		System.out.println("title was wrong");
	}
	
	
	List<WebElement> frame = driver.findElements(By.tagName("frame"));
	
		System.out.println(frame.size());
		
		driver.switchTo().frame(frame.get(0));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frame.get(1));
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		

	}

}
