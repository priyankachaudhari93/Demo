package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Second { 
	
	private static final FileUtils FileUnits = null;
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() throws Exception {
	  
	  try {
		   
		  System.out.println("Start fun");
		  
		  driver.get("http://www.calculator.net/percent.calculator.html");
		  java.util.List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
		  System.out.println("Number of links in the page is" +links.size());
		  System.out.println("_________________________________________");
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("E:\\SELENIUM_JAVA\\SELENIUM\\Screenshot1.jpg"));
		  
		  for(int i = 0; i<links.size(); i = i+1) {
			  System.out.println("Name of Link#" + i + links.get(i).getText());
		  }
		  
		  
	  }
	  
	  catch(Exception e) {
		  throw(e);
	  }
  }
   
  @Test
  public void fun2() throws Exception {
	  
	  try {
		  
		  System.out.println("start fun2");
		  
		  driver.get("http://www.calculator.net/percent.calculator.html");
		  
		  //selcting an item from drop down list box
		  
		  Select dropdown = new Select (driver.findElement(By.id("ccompound")));
		  dropdown.selectByVisibleText("continuously");
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("E:\\SELENIUM_JAVA\\SELENIUM\\Screenshot2.jpg"));
		  Thread.sleep(3000);
		  
		  dropdown.selectByIndex(1);
		  }
	  catch (Exception e)
	  {
		  throw(e); 
	  }
  }
  
  @Test
  public void fun3() throws Exception {
	  try {
		  System.out.println("start fun3");
		  
		  driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
		  Thread.sleep(5000);
		  System.out.println("The output of the IsSelected :" +driver.findElement(By.id("cpayoff3")).isSelected());
		  System.out.println("The output of the IsEnabled :" +driver.findElement(By.id("cpayoff4")).isEnabled());
		  System.out.println("The output of the IsDisplayed :" +driver.findElement(By.id("cpayoff5")).isDisplayed());
		  System.out.println("____________________________________________________");
		  ;
		  File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUnits.copyFile(screenshot,new File("\"E:\\\\SELENIUM_JAVA\\\\SELENIUM\\\\Screenshot3.jpg\""));
	  }
	  
	  catch(Exception e)
	  {
		  throw(e);
		  
	  }
	  
		  
		  
		  
	  }
	  
  
  
@BeforeTest
public void beforeMethod()throws IOException,InterruptedException{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(5000);
}
@AfterTest

public void afterTest() {
	driver.close();
	
  
  
  
  
}

}

	
	
	


