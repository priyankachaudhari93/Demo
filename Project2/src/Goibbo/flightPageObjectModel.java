package Goibbo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flightPageObjectModel {
private static WebElement element=null;
	
	
	
	//No 1 TextBox
	
	public static WebElement from(WebDriver driver) {
		 element=driver.findElement(By.id("gosuggest_inputSrc"));
		 return element;
		
	}
	

	public static WebElement to(WebDriver driver) {
		 element=driver.findElement(By.id("gosuggest_inputDest"));
		 return element;
		
	}
	
	

	public static WebElement date(WebDriver driver) {
		 element=driver.findElement(By.xpath("//*[@id='fare_20181025']"));
		 return element;
		
	}
	

	public static WebElement getsetgo(WebDriver driver) {
		 element=driver.findElement(By.xpath("//button[@id=\"gi_search_btn\"]"));
		 return element;
		
	}
	


}


