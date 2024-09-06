package Selenium_1;

		import java.io.File;
		import java.io.IOException;

		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.io.FileHandler;

		public class Practice {
			
		

			public static void main(String[] args) throws InterruptedException, IOException  {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//screenshot1
				Thread.sleep(2000);
				File T1 = new File("‪C:\\Users\\Dell\\OneDrive\\Desktop\\screen\\S.TXT");
				System.out.println("hi");
			    FileHandler.copy(S1, T1);

	}

}
