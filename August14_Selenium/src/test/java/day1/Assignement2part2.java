package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignement2part2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();//use to open driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("https://demo.guru99.com/test/delete_customer.php");//fetch the mentioned url
	    
		driver.manage().window().maximize();//maximize window
		driver.findElement(By.name("cusid")).sendKeys("567891");// Enter Customer ID
		driver.findElement(By.name("submit")).click();// Click on Submit
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(50));//explicit
		driver.switchTo().alert().accept();//1st alert
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		/*driver.switchTo().alert().accept();
		Alert myalert2=driver.switchTo().alert();
		System.out.println(myalert2.getText());
		myalert2.accept();*/
		driver.quit();
		
//ask
	}

}
