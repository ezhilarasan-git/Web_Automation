package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	
	 public static void main(String[] args) {
	        System.out.println("Hello");
	        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();  // Preferred way
	        driver.get("https://www.google.com");   // Opens Google
	        driver.quit(); // Closes the browser
	    
	}
			

}
