package pkg.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//1. Create a method named ReadData and pass the row no and that method will read the data of that particular row

public class ReadDataParticularRow {
	
	private void ReadData(int row) throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
		FileReader fr = new FileReader(f);  //Read File
		BufferedReader br = new BufferedReader(fr);
		String s;
		int actualRow=0;
		
		while ((s=br.readLine()) != null) {
			actualRow = actualRow+1;
			if (actualRow == row) {
				System.out.println(s);
				break;
			}
			
		}

	}

	public static void main(String[] args) throws IOException {
		
		ReadDataParticularRow rd = new ReadDataParticularRow();
		rd.ReadData(3);

	}

}
