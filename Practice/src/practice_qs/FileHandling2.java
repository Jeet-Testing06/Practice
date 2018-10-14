// write in file

package practice_qs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
	
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JitenderAhuja.txt");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw= new BufferedWriter(fw); 
		
		bw.write("Hi, Write");
		bw.newLine();
		bw.write("Hi, overwrite");
		bw.close();
	}
	
	

}
