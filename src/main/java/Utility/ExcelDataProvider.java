package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static XSSFWorkbook wb;

	public void excelfile() throws Exception {
		String excelfilepath = System.getProperty("user.dir") + "\\TestData\\TestData.xlsx";
		File file = new File(excelfilepath);
		FileInputStream src = new FileInputStream(file);
		wb=new XSSFWorkbook(src);
	}
	
	public String getExcelData(String sheetname, int rownum, int cellnum) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
