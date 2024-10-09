package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.manage().getCookies());
		driver.navigate().refresh();
		//driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		Thread.sleep(1000);
		driver.quit();
		

	}

}
