package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LOgin {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); 
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://portal.imedrix.com/Unifiedi3/#/auth/signin");
		driver.findElement(By.xpath("//input[@placeholder='USER NAME']")).sendKeys("ezhil.b@imedrix.com");
		driver.findElement(By.name("password")).sendKeys("Ezhil1234");
		//driver.findElement(By.xpath("//button[contains(@class,'mat-raised-button') and contains(@class,'mat-primary')]")).click();
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		driver.close();
		System.out.println("Passs");
	}
}

/*package Testing;
By.xpath("//button[@type= 'submit']");
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LOgin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            driver.get("https://portal.imedrix.com/Unifiedi3/#/auth/signin");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname='email']")));
            emailField.sendKeys("ezhil.b@imedrix.com");

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname='password']")));
            passwordField.sendKeys("Demo1234");

            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'mat-raised-button') and contains(@class,'mat-primary')]")));
            loginButton.click();

            // Additional wait to observe the result
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Test Completed");
        }
    }
}
*/
