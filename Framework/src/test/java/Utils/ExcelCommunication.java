package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommunication {

	
	public ExcelCommunication(String excelpath, String sheetname) {
		
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		//GetRowCount();
		//GetCellData();
		GetCellDataNumber(1, 1);
	}

	public static void GetRowCount() {

		try {
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of Rows count is :" +rowcount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
		public static void GetColCount() {

			try {
				
				int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("No. of coloumns count is :" +colcount);
			}
			catch(Exception exp) {
				System.out.println(exp.getMessage());
			}
	}

	public static void GetCellData(int RowNum, int ColNum)
	{
		try {
			
			String celldata = sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
			System.out.println(celldata);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	public static void GetCellDataNumber(int RowNum, int ColNum)
	{
		try {
			
			double celldata = sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			System.out.println(celldata);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
}
