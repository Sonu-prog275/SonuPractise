package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en");
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("abc@1234");//absolute
        driver.manage().window().setSize(new Dimension(450,780));
        boolean logostatus=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/img")).isDisplayed();
        System.out.println("Logo is there and true");
	}

}
