package propExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class ExcelRead {
	public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("E:\\abcd.xls");
	Workbook workbook = Workbook.getWorkbook(fis);
    Sheet sheet = workbook.getSheet(0);
  
    int rows = sheet.getRows();
    int columns = sheet.getColumns();
   
    System.out.println("rows >> " +rows);
    System.out.println("columns >> " +columns);
    
    Cell cell =sheet.getCell(1, 2);
    String val = cell.getContents();
    System.out.println("val >> " +val);
}
}
