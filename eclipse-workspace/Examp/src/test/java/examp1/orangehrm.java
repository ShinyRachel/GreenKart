package examp1;

import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangehrm {

	public static void main(String[] args) { //throws  InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card\"]//button[@title=\"Assign Leave\"]")).click();
driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Thomas Kutty Benny");
driver.findElement(By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"]")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement drpleave=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='CAN - Vacation']")));
drpleave.click();
driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")).sendKeys("2024-27-11");

WebElement toDateInput = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
toDateInput.sendKeys("2024-30-11");
driver.findElement(By.xpath("/div[@class=\"oxd-select-text oxd-select-text--active\"][2]")).click();
WebElement partialdays=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Start Day Only']")));
partialdays.click();
	}
	
	}
