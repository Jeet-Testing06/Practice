// read line by line


package practice_qs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while((s = br.readLine())!=null)
		{
			
			System.out.println(s);
			
		}
		
	}
	
}