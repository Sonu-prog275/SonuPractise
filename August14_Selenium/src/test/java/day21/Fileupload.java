package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		//Single file
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Practise selenium\\1.Java Introduction.pptx");
		if(driver.findElement(By.xpath("ul[@id=\"fileList\"]//li")).getText().equals("1.Java Introduction.pptx"))
		{
			System.out.println("TC is pass");
		}
			
			else
			{
				System.out.println("Tc is fail");
			}
		}
		
		
		
	}
	
	


