package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //open a browser chrome
		ChromeDriver driver=new ChromeDriver();//use to open driver
		
		//open a url
		/*driver.get("https://demowebshop.tricentis.com/");//fetch the mentioned url
		//maximize window
		driver.manage().window().maximize();
		
		String So=driver.getTitle();
		System.out.println(So);
		if(So.contains("Demo Web Shop"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Tesctcase failed");
		}
		
		//to give a wait time
		Thread.sleep(2000);
		
		//quit
		driver.quit();
		*/
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String So=driver.getTitle();
		System.out.println(So);
		if(So.contains("Facebook – log in or sign up"))
		{
			System.out.println("Tc pass");
		}
		else
		{
			System.out.println("Tc is fail");
		}
		driver.findElement(By.id("email")).sendKeys("pooja.pawar995@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Mtp@1388");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().window().getSize());
      driver.manage().deleteAllCookies();
       driver.quit();
	}

}
