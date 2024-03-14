package pkg.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//3. Create a method named WriteData and pass the rowCount and you have to take the data from user , that should be write in the file
public class WriteDataParticularRow {
	
	public void WriteDataRow(int row) throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // Connection with file
		FileWriter fw = new FileWriter(f);  // write file object
		BufferedWriter bw = new BufferedWriter(fw); //Buffer write object
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write down the senetence: ");
		String s=null;
		int i;
		for (i=0; i<row; i=i+1)
		 {
		    s = sc.next();
			bw.write(s);// write data
			bw.newLine();
			
			
		}
		bw.close();
		
		

	}

	public static void main(String[] args) throws IOException {
		
		WriteDataParticularRow wd = new WriteDataParticularRow();
		wd.WriteDataRow(5);
	}

}
