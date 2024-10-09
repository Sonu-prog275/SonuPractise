package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	WebDriver driver;
	@BeforeMethod
	
	void openwebapp()
	{
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/computers");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	void Clicklogin()
	{
	 driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}
	
	
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.cssSelector(".ico-login")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("lion1");
		driver.findElement(By.cssSelector("label[for='RememberMe']")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	
	
	@AfterMethod
	void logout()
	{
	driver.quit();	
	}
	
	

	
	
	
	
	

}




