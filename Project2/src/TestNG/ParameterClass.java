package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterClass {
	@Test(dataProvider="getData")
	public void loginTest(String username,String password,String ExpResult,String Browser)
	{
		System.out.println(username+"-------"+password+"----"+ExpResult+"-----"+Browser);
		
	}
	@DataProvider
	public Object [][] getData(){
		Object[][] data =new Object[3][4];
		
		
		//1strow
		data[0][0]="u1";
		data[0][1]="p1";
		data[0][2]="pass";
		data[0][3]="Mozilla";
		
		//2nd row
		data[1][0]="u2";
		data[1][1]="p2";
		data[1][2]="fail";
		data[1][3]="chrome";
		
		
		//3rd row
		data[0][0]="u3";
		data[0][0]="p3";
		data[0][0]="pass";
		data[0][0]="IE";
		
		return data;
	}

}
