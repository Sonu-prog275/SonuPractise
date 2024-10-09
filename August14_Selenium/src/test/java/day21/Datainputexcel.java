package day21;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datainputexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Folder1\\ok.xlsx");
       
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Excler");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("sonu");
		row1.createCell(1).setCellValue("poo");
		row1.createCell(2).setCellValue("10");
		
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("sonu1");
		row2.createCell(1).setCellValue("poo1");
		row2.createCell(2).setCellValue("101");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("all values present");
		
	}

}
