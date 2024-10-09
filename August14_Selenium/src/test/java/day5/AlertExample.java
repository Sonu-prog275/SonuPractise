package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();//most prefable
			
			driver.manage().window().maximize();
			driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
			/*driver.findElement(By.xpath("//*[@id='alertexamples']")).click();
			Thread.sleep(2000);
			//driver.switchTo().alert().accept();//accept
			Alert myalert=driver.switchTo().alert();
			System.out.println(myalert.getText());
			myalert.dismiss();
			*/
			driver.findElement(By.xpath("//*[@id='promptexample']")).click();
			Alert myalert1=driver.switchTo().alert();
			Thread.sleep(2000);
			//System.out.println(myalert1.getText());
			
			myalert1.sendKeys("Sonu");
			myalert1.accept();

	}

}
