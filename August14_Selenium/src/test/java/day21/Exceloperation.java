package day21;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Folder1\\Newone.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totrow=sheet.getLastRowNum();
		
		int totalcell=sheet.getRow(1).getLastCellNum();
		
        System.out.println(totrow); //7=7-1
        System.out.println(totalcell);//n=n-1=3-1=2
        
        for(int r=0;r<=totrow;r++)//outerloop
        {
        	XSSFRow currentRow=sheet.getRow(r);//xml spread sheet
        	for(int c=0;c<totalcell;c++)//inner loop
        	{
        		XSSFCell cell=currentRow.getCell(c);
        		System.out.println(cell.toString()+"\t");
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
        
	}

}
