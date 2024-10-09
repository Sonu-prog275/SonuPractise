package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Regis")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.manage().window().getSize());//Specify the size
		System.out.println(driver.getCurrentUrl());//fetch current url
		System.out.println(driver.manage().getCookies());//storing temporary information of browser
		
		//driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("123456");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	}

}
