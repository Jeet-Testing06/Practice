// Just like that Practice
// Value given to more than 1 cell at the same time by different label

package practice_qs;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelH4 {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JustLikeThat.xls");
		
		WritableWorkbook wwb = Workbook.createWorkbook(f);
		WritableSheet wws = wwb.createSheet("Jeet", 0);
		WritableSheet wws1 = wwb.createSheet("Jeet", 1);
		WritableSheet wws2 = wwb.createSheet("Jeet", 2);
		
		Label l = new Label(4, 4, "Excel1");
		wws.addCell(l);
		
		Label l1 = new Label(3, 3, "Excel2");
		wws1.addCell(l1);
		
		Label l2 = new Label(2, 2, "Excel3");
		wws2.addCell(l2);
		
		wwb.write();
		wwb.close();
		
	}
}