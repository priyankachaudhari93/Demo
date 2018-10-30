package Goibbo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import ReadWriteExcel.ReadDataFromExcel;

public class Goibboflightpom {  

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//i[@class=\"icon-flights db blue ico24 lh1-2 padT5 padB5\"]")).click();
	//	driver.findElement(By.id("gi_roundtrip_label")).click();
		
	
	
	
		
		ReadDataFromExcel obj = new ReadDataFromExcel("E:\\selinium\\Project2\\FileAccess\\flightdata.xlxs", "Sheet1");

		String per1 = obj.getCellData(1, 1);
		String per2 = obj.getCellData(2, 1);
		String per3 = obj.getCellData(3, 1);

		String val1 = obj.getCellData(1, 2);
		String val2 = obj.getCellData(2, 2);
		String val3 = obj.getCellData(3, 2);

		String result1 = obj.getCellData(1, 3);
		String result2 = obj.getCellData(2, 3);
		String result3 = obj.getCellData(3, 3);

		System.out.println("Per1" + per1);

		ArrayList<String> Per_list = new ArrayList<String>();
		Per_list.add(per1);
		Per_list.add(per2);
		Per_list.add(per3);

		System.out.println("Per_list:" + Per_list);

		ArrayList<String> val_list = new ArrayList<String>();
		val_list.add(val1);
		val_list.add(val2);
		val_list.add(val3);

		System.out.println("Val_list:" + val_list);

		ArrayList<String> result_list = new ArrayList<String>();
		result_list.add(result1);
		result_list.add(result2);
		result_list.add(result3);

		System.out.println("Result List" + result_list);

		try {
			for (int i = 0; i <= Per_list.size(); i = i + 1) {
  
				Thread.sleep(5000);

				flightPageObjectModel.from(driver).clear();
				flightPageObjectModel.from(driver).sendKeys(Per_list.get(i));

				flightPageObjectModel.to(driver).clear();
				flightPageObjectModel.to(driver).sendKeys(val_list.get(i));

				flightPageObjectModel.date(driver).click();
				
				flightPageObjectModel.getsetgo(driver).click();
				

			}
		} catch (Exception e) {

			driver.close();
			throw (e);
		}

	}

		
	
	
	
	}

