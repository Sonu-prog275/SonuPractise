package Day23;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Testngdemo1 {
	

	WebDriver driver=new ChromeDriver();
	@BeforeMethod
	void Invokedriver()
	{
		driver = new ChromeDriver();
		
		
	}
	
	@BeforeClass
	void Url() {
	driver.get("https://demowebshop.tricentis.com/login");	
	}
	
	@BeforeTest
	void window()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	void GetElement() {
	driver.findElement(By.xpath("//*[@class='ico-login']")).click();
	
	}
	
	@AfterMethod
	void Screenshot() {
		TakesScreenshot ts= (TakesScreenshot)driver;//call screenshot
        WebElement P1=driver.findElement(By.xpath("//*[@class='ico-login']"));
        File sourcefile = P1.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\Testngdemo1.png");
        
        
        
        }

         {
        
        }
		
		
	}
	
	
	
	

		
	
	
	

