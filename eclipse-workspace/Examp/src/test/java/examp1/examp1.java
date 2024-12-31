package examp1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class examp1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            // Setup and navigate to the OrangeHRM login page
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Login
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Navigate to Assign Leave
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//div[contains(@class, 'orangehrm-quick-launch-card')]//button[@title='Assign Leave']")).click();

            // Fill Leave Details
            driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Thomas Kutty Benny");

            // Select Leave Type
            driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement drpleave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='CAN - Vacation']")));
            drpleave.click();

            // Set Dates
            driver.findElement(By.xpath("(//input[@placeholder='yyyy-MM-dd'])[1]")).sendKeys("2024-11-27");
            WebElement toDateInput = driver.findElement(By.xpath("(//input[@placeholder='yyyy-MM-dd'])[2]"));
            toDateInput.sendKeys("2024-11-30");

            // Select Partial Days
            driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
            WebElement partialDays = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Start Day Only']")));
            partialDays.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
