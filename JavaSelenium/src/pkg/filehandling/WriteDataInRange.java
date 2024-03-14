package pkg.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Create a method named WritedataRange and pass the intialRowCount, endRowCount and that method will 
//write in that range you have to take the data from the user, which should be written in the file (2,7) 
//while calling the method should write from 2nd to 7th line and the first line will be blank

public class WriteDataInRange {
	
	public void WriteDataRange(int initialRow, int endRow) throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // Connection with file
		FileWriter fw = new FileWriter(f);  // write file object
		BufferedWriter bw = new BufferedWriter(fw); //Buffer write object
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write down the senetence: ");
		String s=null;
		int i;
		for (i=1; i<=endRow; i=i+1)
		 {
			if ((i>=initialRow)&& (i<=endRow))
			{
				s = sc.next();
				bw.write(s);// write data
				bw.newLine();
			}
			else {
				bw.newLine();
			}
		}
		bw.close();

	}
	public static void main(String[] args) throws IOException {
		WriteDataInRange wd = new WriteDataInRange();
		wd.WriteDataRange(2, 7);
		

	}

}
