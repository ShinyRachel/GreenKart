package GreenKart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class kartt extends GreenKart{

	@Test
	public void test()
	{
		driver.findElement(By.xpath("(//a[@class='increment'])[7]")).click();
		driver.findElement(By.xpath("//h4[contains(text(),\"Beans\")]//parent::div//div[3]//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("(//a[@class='increment'])[11]")).click();
		driver.findElement(By.xpath("//h4[contains(text(),\"Potato\")]//parent::div//div[3]//button[@type=\"button\"]")).click();
	}
}
