package loginToNdosiWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screenshots.Screenshot;

public class loginToNdosiWebsite {


    WebDriver driver;
    Screenshot screenshot ;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();

        screenshot = new Screenshot(driver);
    }
    @Test(priority = 1, description = "Login to Ndosi Website")
    public void loginTest() throws InterruptedException {
        screenshot.takesSnapShot(driver, "01_Login_Page");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[1]")).click();
        Thread.sleep(2000);
        screenshot.takesSnapShot(driver, "02_Login_Credentials_Entered");
        driver.findElement(By.id("login-email")).sendKeys("Okuhle@gmali.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        Thread.sleep(2000);
        screenshot.takesSnapShot(driver, "03_Login_Credentials_Entered");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        screenshot.takesSnapShot(driver, "04_Login_Success");
        // Verify login success by checking for the presence of a specific element after login
        String welcomeText = driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]")).getText();
    }
    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }

    }
}


