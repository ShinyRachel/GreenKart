package irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-signup");
		driver.findElement(By.id("userName")).sendKeys("Shi999");
		driver.findElement(By.id("fullName")).sendKeys("Shiny L Babu");
		driver.findElement(By.id("usrPwd")).sendKeys("Shiny12345");
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Shiny12345");
		driver.findElement(By.id("email")).sendKeys("Shinyrachel86@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9840886449");
	}

}
