package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowser {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		@Test
		@Parameters("browsers")
		public void verifypage(String browsername) throws InterruptedException
		{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin2");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		driver.quit();
		


	}

}
