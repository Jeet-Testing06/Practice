// homework
// taking 5 lines input from user and entering into .txt file


package practice_qs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JitenderHomework.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 lines back to back to get write in .txt file");
		
		for(int i=0;i<5;i++) {
		
		String a = s.nextLine();
		bw.write(a);
		bw.newLine();
		}
		bw.close();	
	}
}
