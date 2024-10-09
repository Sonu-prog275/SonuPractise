package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en");
        String S1=driver.getTitle();
        System.out.println(S1);
        if(S1.contains("Sign Up for Facebook"))
        {
        	System.out.println("Pass");
        }
        else
        {
        	System.out.println("Fail");
        }
       // System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("sonu");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Pawar");
        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("sonu.pawar0891@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Mtp@1388");
        driver.findElement(By.xpath("//*[@id='month']")).sendKeys("Aug");
        driver.findElement(By.cssSelector("select#day")).sendKeys("15");//tag id
        driver.findElement(By.cssSelector("select[name=birthday_year]")).sendKeys("1998");//tag attribute
        //ask tag class n class attribute
        driver.findElement(By.xpath("//*[@name='sex']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
        //driver.findElement(By.className("input#code_in_cliff")).click();
        driver.close();
        //driver.navigate().refresh();
       // System.out.println(driver.manage().getCookies());
        //System.out.println(driver.manage().window().getSize());
        //driver.manage().window().setSize(new Dimension (1500, 900));
        
       
        
	}

}
