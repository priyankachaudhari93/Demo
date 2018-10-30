package ObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectPerCalc {
	

	private static WebElement element=null;
	
	
	
	//No 1 TextBox
	
	public static WebElement txt_num_1(WebDriver driver) {
		 element=driver.findElement(By.id("cpar1"));
		 return element;
		
	}
	

	public static WebElement txt_num_2(WebDriver driver) {
		 element=driver.findElement(By.id("cpar2"));
		 return element;
		
	}
	
	

	public static WebElement btn_calc(WebDriver driver) {
		 element=driver.findElement(By.xpath(".//input[@value='Calculate']"));
		 return element;
		
	}
	

	public static WebElement web_result(WebDriver driver) {
		 element=driver.findElement(By.xpath(".//*[@id='content']//font/b"));
		 return element;
		
	}
	


}