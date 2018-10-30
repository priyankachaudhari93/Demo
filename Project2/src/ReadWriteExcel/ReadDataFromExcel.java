package ReadWriteExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static XSSFSheet ExcelWSheet;
	public static XSSFWorkbook ExcelWbook;
	public static XSSFCell Cell;
	public static XSSFRow Row;

	public ReadDataFromExcel(String path, String SheetName) throws Exception {
		try {
			// open the excel file
			FileInputStream ExcelFile = new FileInputStream(path);
			// access the required test data sheet
			ExcelWbook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWbook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	// this method is to read data from excel cell,in this we are passing parametre
	// as row num and col num
	public String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			// system.out.println("Celldata:"+celldata);
			return CellData;
		} catch (Exception e) {
			return "";
		}

	}
	

	public static void main(String[] args) throws Exception {
		
	
		ReadDataFromExcel obj =new ReadDataFromExcel("E:\\selinium\\Project2\\FileAccess\\per.xlsx", "Sheet1");
		
		System.out.print(obj.getCellData(0, 0)+" : "+obj.getCellData(0, 1)+"\n");
		System.out.print(obj.getCellData(1, 0)+" : "+obj.getCellData(1, 1)+"\n");
		System.out.print(obj.getCellData(2, 0)+" : "+obj.getCellData(2, 1)+"\n");

	}


}
