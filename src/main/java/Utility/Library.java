package Utility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_SendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception E) {
			System.out.println("Unable to send Value"+E);
		}
	}
	public static void custom_Click(WebElement element) {
		try {
			element.click();
		}catch(Exception E) {
			System.out.println("Unable to click"+E);
		}
	}
}
