package Default;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchCase_StoreDataInFile {

	public static void main(String[] args) throws InterruptedException, IOException {

		int n;
		WebDriver driver = new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		Actions action = new Actions(driver);
		PrintWriter out = null;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//webdriver commands
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");

		
		System.out.println("URL opened sucessfully!");

		TakeSnapshot(driver, "E:\\SELENIUM_JAVA\\SELENIUM\\Screenshots\\snap11.jpg");

		// Accept case no
		System.out.println("Enter case: ");
		n = sc.nextInt();

		// Mouse hover
		WebElement element = driver.findElement(By.xpath("//a[text()='Colleges']"));

		// switch case to select options
		switch (n) {

		case 1:
			String filepath="E:\\selinium\\Project2\\FileStoreTEXT\\Sel1";
			BufferedWriter bufferwrt = CreateFile(filepath);

		action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title='Arts & Science Colleges']"))).click().build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Arts & Science Colleges Page Successfully ! ");

			List rows = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));

			for (int j = 1; j < rows.size(); j = j + 1) {

				String collegename = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]"))
						.getText();

				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");

				
				bufferwrt.write(collegename);
				bufferwrt.newLine();
				bufferwrt.write(district);
				bufferwrt.newLine();
				bufferwrt.write(state);
				bufferwrt.newLine();
				
				
				String Titlename=js.executeScript("return document.title").toString();
				
				File newTextFile = new File("E:\\selinium\\Project2\\FileStoreTEXT\\Sel1.txt");
		           FileWriter fw = new FileWriter(newTextFile);
		           fw.write(collegename );
		           fw.write(district);
		           fw.write(state);
		           
		           
		           File renFile =new File(Titlename);
		           newTextFile.renameTo(renFile);
		           fw.close();

				TakeSnapshot(driver, "E:\\selinium\\Project2\\ScreenShots\\snap12.jpg");
			}

			driver.navigate().back();

		case 2:

			action.moveToElement(element)
					.moveToElement(driver.findElement(By.xpath("//a[@title=\"Universities in India\"]"))).click()
					.build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Universities in India Page Successfully ! ");

			List row2 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));

			for (int j = 1; j < row2.size(); j = j + 1) {

				String collegename = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]"))
						.getText();

				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");

				TakeSnapshot(driver, "E:\\selinium\\Project2\\ScreenShots\\snap13.jpg");
			}
			driver.navigate().back();

		case 3:

			action.moveToElement(element)
					.moveToElement(driver.findElement(By.xpath("//a[@title=\"Engineering Colleges\"]"))).click().build()
					.perform();
			Thread.sleep(4000);
			System.out.println("Opened Engineering Colleges Page Successfully ! ");

			List row3 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));

			for (int j = 1; j < row3.size(); j = j + 1) {

				String collegename = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]"))
						.getText();

				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");

				TakeSnapshot(driver, "E:\\selinium\\Project2\\ScreenShots\\snap14.jpg");
			}
			driver.navigate().back();

		case 4:

			action.moveToElement(element)
					.moveToElement(driver.findElement(By.xpath("//a[@title=\"Management Colleges\"]"))).click().build()
					.perform();
			Thread.sleep(4000);
			System.out.println("Opened Management Colleges Page Successfully ! ");

			List row4 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));

			for (int j = 1; j < row4.size(); j = j + 1) {

				String collegename = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver
						.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]"))
						.getText();

				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");

				TakeSnapshot(driver, "E:\\selinium\\Project2\\ScreenShots\\snap15.jpg");
			}

			driver.navigate().back();

		}

		// PrintStream myconsole= new PrintStream(new
		// File("E:\\SELENIUM_JAVA\\SELENIUM\\FilesStore\\Sel1.txt"));
		// System.setOut(myconsole);
		// myconsole.print("Hello");

	}

		public static void TakeSnapshot(WebDriver driver, String Filepath) throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(Filepath));

	}

}
 