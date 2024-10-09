package day25;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		@Test(dataProvider="automationdata")
		public void logintopage(String username, String password) throws InterruptedException
		{
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			String expectedmessage = "Please enter a valid email address.";
			String originalmessage = driver.findElement(By.xpath("//span[@for='Email']")).getText();
			Assert.assertEquals(originalmessage, expectedmessage);
			//System.out.println("The verification is done");
			Thread.sleep(5000);
			driver.quit();
			
			}
		
		
		@DataProvider(name="automationdata")
		public Object [][] passData()
		{
			Object [][] data = new Object[4][2];
			
			data[0][0] ="admin1";
			data[0][1] = "admin2";
			
			data[1][0] ="admin3";
			data[1][1] = "admin4";
			
			data[2][0] ="admin5";
			data[2][1] = "admin6";
			
			data[3][0] ="admin7";
			data[3][1] = "admin8";
			
			return data;
			
			//ask


	}


}
}

