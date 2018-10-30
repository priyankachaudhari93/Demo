package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestB {
  @Test
  public void f() {
	  System.out.println( "Test Suit");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hello A");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("hello b.... ");
  }

}
