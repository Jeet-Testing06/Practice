// homework
// read from 1 file and write to another file

package practice_qs;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling5 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		File f1 = new File("C:\\Users\\jitender.ahuja\\Desktop\\Write.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while((s = br.readLine())!=null)
		{
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(s);
			bw.newLine();
			bw.close();
				
		}	
	}
}