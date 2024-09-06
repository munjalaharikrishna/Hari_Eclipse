package Selenium_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;

public class add {

	public static void main(String[] args) throws AWTException {
	int a = 2;
	for(int i =1;i<=5; i++) {
		a++;
		}
	System.out.println(a);
	
	Robot r = new Robot();
	r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	
	
	
		}
}
