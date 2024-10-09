package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");//get url
        //fetch the title
		System.out.println(driver.getTitle());//will fetch particular title
		//fetch URL
		System.out.println(driver.getCurrentUrl());
		
		//fetch the page source
		System.out.println(driver.getPageSource());
		
		driver.close();
	}
	
	
	
	

}
