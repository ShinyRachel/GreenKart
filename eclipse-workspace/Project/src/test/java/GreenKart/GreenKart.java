package GreenKart;

import org.testng.annotations.AfterClass;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GreenKart {
	WebDriver driver=new ChromeDriver();
	@BeforeSuite
	public void url()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.xpath("(//a[@class='increment'])[2]")).click();
		driver.findElement(By.xpath("//h4[contains(text(),\"Cauliflower\")]//parent::div//div[3]//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("(//a[@class='increment'])[6]")).click();
		driver.findElement(By.xpath("//h4[contains(text(),\"Tomato\")]//parent::div//div[3]//button[@type=\"button\"]")).click();
	}
@AfterMethod
public void cart()
{
	driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	driver.findElement(By.xpath("//div[@class='action-block']//button[@type='button']")).click();
	String expected_amount = "154";  //# Adjust as per your test case

	//# Locate the total amount element
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement total_amount_element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='discountAmt']"))); // # Replace 'ID' with the appropriate selector

	//# Retrieve and process the total amount text
	String total_amount_text = total_amount_element.getText();  //# e.g., "$100.00"
	//System.out.println(total_amount_text);
	//System.out.println(expected_amount);
	//# Remove currency symbol and convert to float
	//double total_amount = Double.parseDouble(total_amount_text);

//	# Compare with the expected amount
	if(total_amount_text.equals(expected_amount))
	{
		System.out.println("Total Amount:" +total_amount_text);
	}
	else 
	{
		System.out.println("Mismatch: Expected"  + "  " +expected_amount +"  " + "but got"  +"  "+ total_amount_text);
	}

	
}
@AfterClass
public void placeorder()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement placeorder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']")));
	placeorder.click();
	WebElement dropdown = driver.findElement(By.cssSelector("select"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("India");
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	if(!checkbox.isSelected())
	{
		checkbox.click();
	}
	
	WebElement proceed=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed']")));
	proceed.click();
}
	
@AfterSuite
public void quit()
{
	driver.quit();
}
}