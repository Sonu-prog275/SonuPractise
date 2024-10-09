package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//open a browser
		
		driver.manage().window().maximize();//maximize the browser
		
		//open Url
		driver.get("https://demowebshop.tricentis.com/");
		
		//enter somedata inside search box
		driver.findElement(By.id("small-searchterms")).sendKeys("Sonu");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		
		//wait time
		//Thread.sleep(2000);//1000ms=1sec
		
		//quit
		//driver.quit();
		
		

	}

}
