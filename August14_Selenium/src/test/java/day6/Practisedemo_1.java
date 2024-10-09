package day6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practisedemo_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicity wait
		String S1=driver.getTitle();
		System.out.println(S1);
		if(S1.contains("Test Page For JavaScript Alerts"))
		{
		System.out.println("Tc is pass");
		}
		else
		{
			System.out.println("Tc is fail");
		}
		//driver.findElement(By.cssSelector("input#alertexamples")).click();
		driver.findElement(By.xpath("//*[@id='alertexamples']")).click();
		driver.switchTo().alert().accept();
		Alert R1=driver.switchTo().alert();
		System.out.println(R1.getText());
		R1.accept();
		//ask
	

	
	}

}
