package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	@Test()  
	public void loginTest() {
		System.out.println("Excute the login test");
		
	}
	
	@Test()
	public void homeTest() {
		System.out.println("Excute the home navigation test");
		throw new SkipException("hold on");
	}
	@Test()
	public void logoutTest() {
		System.out.println("excute the logout test ");
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.co.in");
		driver.findElement(By.name("R")).click();
		driver.quit();
	}
}
