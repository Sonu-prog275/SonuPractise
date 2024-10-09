package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskRoh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Denny1");
		driver.findElement(By.name("LastName")).sendKeys("Den");
		driver.findElement(By.id("Email")).sendKeys("Prac221@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("jo123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("jo123456");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.className("button-1 register-continue-button")).click();
      if(driver.findElement(By.xpath("//div[@class='result']")).getText().equals("Your registration completed"))
      {
    	  System.out.println("Registration is completed");
      }
      else
      {
    	  System.out.println("No registration");
      }
	}

}


