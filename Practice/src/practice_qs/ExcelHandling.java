package practice_qs;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelHandling {
	
	public static void main(String[] args) throws BiffException, IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jeet.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		
		int c = ws.getColumns();
		int r = ws.getRows();
		
		System.out.println("Number of rows: "+r);
		System.out.println("Number of columns: "+c);
		
		System.out.println();
		
		for(int i=0; i<r; i++)
		{
			for (int j = 0; j<c; j++)
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());	
			}	
		}	
	}
}