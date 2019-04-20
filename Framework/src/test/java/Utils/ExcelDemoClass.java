package Utils;

public class ExcelDemoClass {

	public static void main(String[] args) {
		
	
		ExcelCommunication excel = new ExcelCommunication("C:/Automation/Practice/Cucumber Framework/Framework/ExcelFile/Data.xlsx", "Sheet1");
		
		excel.GetCellData(0, 0);
		excel.GetCellDataNumber(1,1);
		excel.GetRowCount();
	}

}
