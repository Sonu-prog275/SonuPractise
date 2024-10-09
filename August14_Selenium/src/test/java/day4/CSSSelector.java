package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();//most prefable
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(3));//explicit
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#small-searchterms"))).sendKeys("poo");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("poo");//tagid
       //driver.findElement(By.cssSelector("input.button-1")).click();//tag.classname
      // driver.findElement(By.cssSelector("input[value='Search']")).click();//tag attribute
       
      driver.findElement(By.cssSelector("input.button-1[value=/'Search']")).click();//classattribute
	}

}
