package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[class='nav float-end'] div[class='dropdown'] span[class='d-none d-md-inline']")).click();
       // driver.findElement(By.cssSelector("a.dropdown-item")).click();
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
        driver.findElement(By.name("firstname")).sendKeys("sq");
        driver.findElement(By.name("lastname")).sendKeys("sq1");
        driver.findElement(By.name("email")).sendKeys("sq1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("sq123");
	}
	

}
