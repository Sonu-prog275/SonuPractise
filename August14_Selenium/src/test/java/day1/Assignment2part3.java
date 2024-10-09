package day1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();//use to open driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("https://jqueryui.com/draggable");//fetch the mentioned url
		driver.manage().window().maximize();//maximize window
		//driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable"));
		 Actions actions = new Actions(driver);
        //JavascriptExecutor js=(JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoview(),",From);
       
		
       actions.dragAndDropBy(draggable, 135, 40).perform();
    		
         TakesScreenshot ts= (TakesScreenshot)driver;//call screenshot   
         File sourcefile = ts.getScreenshotAs(OutputType.FILE);
         File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\draggableassignment2.png");
         sourcefile.renameTo(targetfile);
        driver.quit();
        
        
    

	}

}
