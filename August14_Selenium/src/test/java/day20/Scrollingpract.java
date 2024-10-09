package day20;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,250)","");//scrolled the right side bar
	     System.out.println(js.executeScript("return window.pageYOffset;"));//y axises length
	     js.executeScript("document.body.style.zoom='75%'");//zoom
	     TakesScreenshot ts2= (TakesScreenshot)driver;
	     File sourcefile1 = ts2.getScreenshotAs(OutputType.FILE);
	     File targetfile1=new File(System.getProperty("user.dir")+"\\ScreenShot1\\scroll1selfp.png");//ss of zoom
	     sourcefile1.renameTo(targetfile1);
	     driver.quit();
	    
		
		
		
	        
	   
	     
         
	}

}
