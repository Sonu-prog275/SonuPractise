package day4;

import org.openqa.selenium.edge.EdgeDriver;

public class Multiplebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();//most prefable
		//FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");//get url
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.manage().window().getSize());
		//System.out.println(driver.);
        driver.close();
	}

}
