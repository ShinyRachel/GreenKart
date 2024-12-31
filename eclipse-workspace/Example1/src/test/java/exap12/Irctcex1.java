package exap12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Irctcex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("name")).sendKeys("Sweta");
		driver.findElement(By.cssSelector("input[data-qa ='signup-email']")).sendKeys("Sweta86@gmail.com");
		//driver.wait(1000);
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.id("password")).sendKeys("Shiny@123");
		driver.findElement(By.cssSelector("input[name='newsletter']")).click();
		driver.findElement(By.cssSelector("input[name='optin']")).click();
		driver.findElement(By.id("first_name")).sendKeys("Shiny");
		driver.findElement(By.id("last_name")).sendKeys("Babu");
		driver.findElement(By.id("company")).sendKeys("Third Eye");
		driver.findElement(By.id("address1")).sendKeys("Mahatma Gandhi Street");
		driver.findElement(By.id("address2")).sendKeys("Madanadapuram");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("zipcode")).sendKeys("600 125");
		driver.findElement(By.id("mobile_number")).sendKeys("984086449");
		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
		driver.findElement(By.cssSelector("a href[data-qa='continue-button']")).click();
	}

}
