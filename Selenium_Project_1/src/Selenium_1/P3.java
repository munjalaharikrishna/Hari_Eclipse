package Selenium_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        File S1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Thread.sleep(2000);

        // Manually type the file path without hidden characters and with the correct extension (saving as .PNG)
        File T1 = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\screen\\S5 .jpg");

       
            FileHandler.copy(S1, T1);
            


    }



}



	
