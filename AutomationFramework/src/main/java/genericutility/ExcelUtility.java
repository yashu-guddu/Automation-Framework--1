package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/*
	 * this method takes sheetname,rowIndex,colIndex as an argument and returns value present in the cell
	 */

	public String getStringDataFromExecl(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/excel.framework.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
	public boolean getBooleanDataFromExcel(String sheetname, int rowIndex, int colIndex)throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/excel.framework.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	
	public double getNumberDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/excel.framework.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	
	public  LocalDateTime getDateFromExcel(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/excel.framework.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}
}
