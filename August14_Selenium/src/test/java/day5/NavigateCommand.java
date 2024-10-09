package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();//most prefable
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");//get url
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.ico-login")).click();//by class name
		//driver.findElement(By.xpath("//*[@class='ico-login']")).click();//By absolute xpath
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		

	}

}
