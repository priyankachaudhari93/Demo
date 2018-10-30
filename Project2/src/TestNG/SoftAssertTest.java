package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

public class SoftAssertTest {
	SoftAssert softAssert = new SoftAssert();
	
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("--------Before Method---");
  }

  
  @Test
  public void Test2()
  {
	  int a=2;
	  int b=2;
	  
	  System.out.println("Executing Test2");
	  String Actualtitle="Amzone";
	  System.out.println("Actualtitle:" + Actualtitle);
	  String Expectedtitle ="Amzone";
	  softAssert.assertEquals(Expectedtitle ,Actualtitle);
	  System.out.print("A\n");
	  if(a== b)
	  {
		  Assert.fail("Both  Values are same Failling Test Cases");
	  }
	  
	  
	  System.out.println("B\n");
	  softAssert.assertEquals(a, b);
	  System.out.println("c\n");
	  softAssert.assertAll();
  }
  
  }
 