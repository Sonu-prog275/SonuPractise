package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver=new EdgeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/r.php?locale=en");
	      Thread.sleep(2000);
	      driver.navigate().refresh();//refresh
	      driver.navigate().back();
	      driver.get("https://www.facebook.com/r.php?locale=en");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("sonu");
	        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Pawar");
	        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("sonu.pawar0891@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Mtp@1388");
          WebElement dropdown=driver.findElement(By.xpath("//*[@id='day']"));
          Select dropdownele=new Select(dropdown);
          dropdownele.selectByIndex(14);
          WebElement dropdown1=driver.findElement(By.id("month"));
          Select dropdownele1=new Select(dropdown1);
          dropdownele1.selectByIndex(7);
          WebElement dropdown2=driver.findElement(By.id("year"));
          Select dropdownele2=new Select(dropdown2);
          dropdownele2.selectByValue("1998");
          driver.findElement(By.cssSelector("input#sex")).click();
          driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
          
        
	}

}

