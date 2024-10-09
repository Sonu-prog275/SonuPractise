package day20;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();	
        //full screen shot
        
        //TakesScreenshot ts= (TakesScreenshot)driver;//call screenshot
       
       /* File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        //calling to the file
        
        File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\specific.png");
        sourcefile.renameTo(targetfile);
       driver.quit();
       */ 
                    
       //capture the ss on specific element
        TakesScreenshot ts= (TakesScreenshot)driver;//call screenshot
        WebElement P1=driver.findElement(By.xpath("//a[@class='account']"));
        File sourcefile = P1.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\abx.png");
        sourcefile.renameTo(targetfile);
        driver.quit();
	
	}

}
