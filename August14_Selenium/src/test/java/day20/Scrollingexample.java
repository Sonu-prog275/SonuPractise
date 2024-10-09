package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrollingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
       // driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,1000)","");
       // System.out.println(js.executeScript("return window.pageYOffset;"));
        //by element
        WebElement Products=driver.findElement(By.xpath("//a[@class='account']"));
        js.executeScript("arguments[0].scrollIntoview();",Products);
        
        //to bottom
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        //check xpath

	}
	

}
