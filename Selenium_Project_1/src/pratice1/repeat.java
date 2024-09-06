package pratice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class repeat {

	public static void main(String[] args) {
		
		
		        
		        int[] sequence = {1, 0, 1, 5, 1, 0, 5, 0};
		        
		       
		        int[] repetitionCounts = countRepetitions(sequence);
		        
		        
		        for (int i = 0; i < repetitionCounts.length; i++) {
		            if (repetitionCounts[i] > 0) {
		                System.out.println("The number " + i + " repeats " + repetitionCounts[i] + " times in the array.");
		            }
		        }
		    }
		    
		    public static int[] countRepetitions(int[] sequence) {
		        int[] repetitionCounts = new int[10];
		        
		       
		        for (int i = 0; i < sequence.length; i++) {
		            int num = sequence[i];
		            repetitionCounts[num]++;
		        }
		        
		        return repetitionCounts;
		    }

		    public class SetWindowSize {
		        public static void main(String[] args) {
		            WebDriver driver = new ChromeDriver();
		            driver.get("https://www.example.com");

		            Dimension d = new Dimension(1024, 768);
		            driver.manage().window().setSize(d);

		            driver.quit();
		        }
		    }

	}



