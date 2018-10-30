package Default;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ObjectModule.PageObjectPerCalc;
import ReadWriteExcel.ReadDataFromExcel;
//import ReadWriteExcel.ReadExcelData;

public class CalculatePercentExcel {

	private static WebDriver driver = null;

	public static void main(String args[]) throws Exception {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.get("https://www.calculator.net/percent-calculator.html");
		
		

		ReadDataFromExcel obj = new ReadDataFromExcel("E:\\selinium\\Project2\\FileAccess\\per.xlsx", "Sheet1");

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

				PageObjectPerCalc.txt_num_1(driver).clear();
				PageObjectPerCalc.txt_num_1(driver).sendKeys(Per_list.get(i));

				PageObjectPerCalc.txt_num_2(driver).clear();
				PageObjectPerCalc.txt_num_2(driver).sendKeys(val_list.get(i));

				PageObjectPerCalc.btn_calc(driver).click();
				String result = PageObjectPerCalc.web_result(driver).getText();

				if (result.equals(result_list.get(i))) {
					System.out.println("____________________________________________________");
					System.out.println("The Result is pass: " + result);

				} else {
					System.out.println("____________________________________________________");
					System.out.println("The result is fail!" + result);

				}

			}
		} catch (Exception e) {

			driver.close();
			throw (e);
		}

	}

}
