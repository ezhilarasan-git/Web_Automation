package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class OrangeHRM_LoginTest {

    WebDriver driver;

    
    public void setUp() {
    	System.setProperty("webdriver.chromeDriver","D:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

   
    public void loginTest() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String dashboardText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(dashboardText, "Dashboard");
    }

   
    public void tearDown() {
        driver.quit();
    }
}
    