package Utils;

public class ExcelDataProvider<ExcelUtils> {

	
	public  void testdata(String excelpath, String sheetname) {
		
		ExcelUtils excel = new ExcelUtils();
		
				(excelpath,sheetname);
		int rowcount = excel.GetRowCount();
		int colcount = excel.GetColCount();
		
	}
}
 