package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practisedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();//most prefable
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.findElement(By.id("name")).sendKeys("name");
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("0231456789");
		 driver.findElement(By.id("textarea")).sendKeys("Mumbai");
		driver.findElement(By.id("female")).click();
		   /*List<WebElement> checkboxes= driver.findElement(By.id("sunday"));
		 
	    for(int i=0;i<checkboxes.size();i++)
	       {
	    	   checkboxes.get(i).click();
	       }
	       */
		
		 
				 
		 

	}

}
