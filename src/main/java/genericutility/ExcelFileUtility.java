package genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String readdatafromExcelFileUtility(String SheetName, int RowNum,int ColNum) throws Throwable {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelfileutilitypath);
		Workbook wb= WorkbookFactory.create(fis);
		//return wb.getSheet(SheetName).getRow(RowNum).getCell(ColNum).getStringCellValue();
		return wb.getSheet(SheetName).getRow(0).getCell(0).getStringCellValue();
	}

}
