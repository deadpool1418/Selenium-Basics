package ddt;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingWritingExcel {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("files/ddt.xlsx"));
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		XSSFCell cell;
		for(int i=1; i<=sheet.getLastRowNum();i++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			System.out.println(cell.getStringCellValue());
		}
	}

}
