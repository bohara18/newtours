package testNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadWrite {
	
@Test
public void Excel() throws IOException {
FileInputStream file=new FileInputStream("C:\\Users\\aarad\\Documents\\Testdatasheet\\Testdatasheet.xlsx");
	
XSSFWorkbook wb =new XSSFWorkbook(file);
	XSSFSheet sh=wb.getSheet("Sheet1");
	
	Row rows=null;
	for(int i=0;i<10;i++) {
	
	sh.createRow(i).createCell(0).setCellValue("sellinium");
	}
	
	FileOutputStream fi=new FileOutputStream("C:\\Users\\aarad\\Documents\\Testdatasheet\\Testdatasheet.xlsx");
	
	
	wb.write(fi);
	fi.close();
}







}