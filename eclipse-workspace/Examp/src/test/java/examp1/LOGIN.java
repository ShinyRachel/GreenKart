package examp1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LOGIN {
	
	WebDriver driver=new EdgeDriver();
	
	@BeforeSuite
	public void Login()
	{
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void Method()
	{
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("Shinyrachel86@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shiny@123");
			driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void method1()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement product=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Beautiful Peacock Blue Cotton Linen Saree\")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a[contains(text(),\"View Product\")]")));
		product.click();
		//driver.findElement(By.xpath("//p[contains(text(),\"Beautiful Peacock Blue Cotton Linen Saree\")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a[contains(text(),\"View Product\")]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("BeforeMethod");
	}
	@Test
	public void method2()
	{
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[2]//p[2]//a")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[3]//button[contains(text(),\"Continue Shopping\")]")).click();
		System.out.println("Test");
	}
	
}

