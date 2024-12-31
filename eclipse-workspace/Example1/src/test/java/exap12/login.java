package exap12;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver=new ChromeDriver();
driver.get("https://automationexercise.com/login");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("Shinyrachel86@gmail.com");
driver.findElement(By.name("password")).sendKeys("Shiny@123");
	driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//p[contains(text(),\"Beautiful Peacock Blue Cotton Linen Saree\")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a[contains(text(),\"View Product\")]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.findElement(By.xpath("//div[@class=\"modal-content\"]//following-sibling::div[3]//button[@class=\"btn\"and data-dismiss=\"modal\"]")).click();
	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//following-sibling::div[3]//button[contains(text(),\"Continue Shopping\")]")).click();
	//driver.findElement(By.xpath("//p[contains(text(),\"Lace Top For Women\")]//parent::div//parent::div//following-sibling::div[@class=\"choose\"]//ul//li//a")).click();
	driver.findElement(By.xpath("//p[contains(text(),\"Lace Top For \")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a")).click();
	driver.findElement(By.cssSelector("button[type='button']")).click();
	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[2]//p[2]//a")).click();
	}
}
