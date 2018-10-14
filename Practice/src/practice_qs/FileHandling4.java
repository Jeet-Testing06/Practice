// Append in a file

package practice_qs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling4 {
	
	public static void main(String[] args) throws IOException {
		
File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JitenderAhuja.txt");
		
		FileWriter fw = new FileWriter(f, true);
		
		BufferedWriter bw= new BufferedWriter(fw); 
		bw.newLine();
		bw.write("Hi, Append added");
		bw.close();
		
	}
	
	

}
