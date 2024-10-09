package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();//most prefable
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");//get url
       List<WebElement> checkboxes= driver.findElements(By.cssSelector("input.form-check-input[type=\"checkbox\"]"));//class attribute
       for(int i=0;i<checkboxes.size();i++)
       {
    	   checkboxes.get(i).click();
       }
       
	}
	

}
