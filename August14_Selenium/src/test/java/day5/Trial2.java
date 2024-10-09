package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.ico-register")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class=\"cart-label\"]")).click();//by tag attribute
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.findElement(By.xpath("//*[@class='cart-label']")).click();
		driver.close();
		
		

	}

}
