package TestNG;

import org.testng.annotations.Test;

public class DisableEnableTest{

	
	
@Test
public void Hotel(){
	
	System.out.println("Excute the hotel test");
}



@Test(enabled=false)

public void Flight(){
System.out.println("Execute the flight test");
}

@Test
public void Car()
{
	System.out.println("execute the car test");

}

}