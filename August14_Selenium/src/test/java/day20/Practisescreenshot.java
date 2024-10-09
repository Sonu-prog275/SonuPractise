package day20;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        TakesScreenshot ts1= (TakesScreenshot)driver;
        WebElement Po=driver.findElement(By.xpath("//*[@class=\"ico-login\"]"));
        File sourcefile = Po.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot1\\demowebshop1.png");
        sourcefile.renameTo(targetfile);
        
        
        driver.navigate().to("https://www.linkedin.com/home");
        TakesScreenshot ts2= (TakesScreenshot)driver;
        File sourcefile1 = ts2.getScreenshotAs(OutputType.FILE);
        File targetfile1=new File(System.getProperty("user.dir")+"\\ScreenShot1\\link2.png");
        sourcefile.renameTo(targetfile);
        driver.quit();
        
        //ask
	}

}
