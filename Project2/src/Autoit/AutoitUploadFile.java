package Autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitUploadFile {

	public static void main (String []args) throws InterruptedException, IOException{
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		driver.findElement(By.name("userfile")).click();
		Thread.sleep(5000);
		//Runtime.getRuntime().exec("E:\\selinium\\Autoit\\Autoit1.exe");
		Runtime.getRuntime().exec("control");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@value='Send File']")).click();
		Thread.sleep(5000);
	}

	
}
