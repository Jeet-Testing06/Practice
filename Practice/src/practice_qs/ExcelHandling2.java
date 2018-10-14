//Homework
//User input and write in excel sheet

package practice_qs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling2 {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter a string to enter in cell");
		String s1 = s.nextLine();
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JeetHomeWork.xls");
		
		WritableWorkbook workbook = Workbook.createWorkbook(f);
		WritableSheet ws = workbook.createSheet("Jeet", 0);
		
		for (int i=0; i<1; i++)
		{
			for (int j=0;j<1;j++)
			{
				
				Label l = new Label(j, i, s1);
				ws.addCell(l);
				
			}
			
		}
		
		workbook.write();
		workbook.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
