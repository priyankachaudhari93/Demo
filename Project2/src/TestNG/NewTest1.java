package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest1 {
  @Test
  @Parameters("username")
  public void NewTest1 ( String username) {
	  System.out.println("username:" + username);
  }
 
 
}
