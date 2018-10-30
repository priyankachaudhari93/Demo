package Goibbo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibbo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//i[@class=\"icon-flights db blue ico24 lh1-2 padT5 padB5\"]")).click();
	//	driver.findElement(By.id("gi_roundtrip_label")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Pune");
		//Thread.sleep(3000);
		
		
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai");

		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@class=\"form-control inputTxtLarge widgetCalenderTxt\"])[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id='fare_20181025']")).click();
		//Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@id=\"gi_search_btn\"]")).click();
			
		TakeSnapshot(driver, "E:\\SELENIUM_JAVA\\SELENIUM\\GO1.jpg");

		

	}
	

	public static void TakeSnapshot(WebDriver driver, String Filepath)throws IOException
	{
		java.io.File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,  new File(Filepath));
		
}

}
