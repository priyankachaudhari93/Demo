package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AutomationNG {
  @Test
  public void f() {
	  
	  
	  System.out.println("FUNCTION");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("3");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("4");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("5");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Execute the before Test Suit Method");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Execute the after test suit method");
	  
  }

}
