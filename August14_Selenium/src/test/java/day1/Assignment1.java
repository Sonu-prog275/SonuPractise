package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();//use to open driver
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		//open a url
		driver.get("https://demo.guru99.com/test/radio.html");//fetch the mentioned url
		
		
		driver.manage().window().maximize();//maximize window
		
		driver.getTitle();//1st title
		String M1=driver.getTitle();
		System.out.println(M1);
		if(
				M1.contains("Radio Button & Check Box Demo"))
		{
			System.out.println("Tc is pass");
		}
		else
		{
			System.out.println("Tc is fail");
		}
		
		driver.findElement(By.cssSelector("input#vfb-7-1")).click();//1st radiobuttin
		driver.findElement(By.id("vfb-6-0")).click();//1st checkbox
		driver.findElement(By.id("vfb-6-1")).click();//2nd checkbox
		driver.navigate().forward();
		driver.get("https://demo.guru99.com/test/newtours/register.php");//fetch second url
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(50));//explicit
		JavascriptExecutor js= (JavascriptExecutor)driver;//scrolling screen
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		//WebDriverWait mywait1=new WebDriverWait(driver,Duration.ofSeconds(50));//explicit
		WebElement Country=driver.findElement(By.name("country"));
		Thread.sleep(3000);
        Select dropdown=new Select(Country);
        Thread.sleep(3000);
        dropdown.selectByVisibleText("KUWAIT");
        Thread.sleep(3000);
        System.out.println("Kuwait is selected"); //kuwait is printed
        driver.quit();

      
        
       
		
		
	}

	
}
