package TestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependencyTest {
	WebDriver Driver =new ChromeDriver();
	
	@Test(priority =3)
	public void LoginTest() {
		System.out.println("Execute the Login Test");
		
	}
	@Test(priority=2, dependsOnMethods={"LoginTest"}) 
	public void ChangePassTest() {
		System.out.println("Execute the change password test");
	}
	
	@Test(priority =2)
	public void LogoutTest() {
		System.out.println("execute the login test");
		Driver.get("https://google.com");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.name("q")).clear();
		Driver.close();
	}

}
