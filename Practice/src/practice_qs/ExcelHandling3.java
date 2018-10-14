//Homework
// Read data from 1 excel and write in 2 excel

package practice_qs;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling3 {
	
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jeet.xls");
		File f1 = new File("C:\\Users\\jitender.ahuja\\Desktop\\JeetHomeWork1.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		
		int r = ws.getRows();
		int c = ws.getColumns();
		
		WritableWorkbook workbook = Workbook.createWorkbook(f1);
		WritableSheet wws = workbook.createSheet("Jeet", 0);
		
		for(int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				Cell c1 = ws.getCell(j, i);
					
					Label m = new Label(j, i, c1.getContents());
					wws.addCell(m);
					
			}	
		}	
		
		workbook.write();
		workbook.close();
		
			}
			
	}