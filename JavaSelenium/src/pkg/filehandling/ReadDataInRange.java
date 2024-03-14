package pkg.filehandling;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
//2. Create a method named ReadDataRange and pass the initial row no and end row no. that method will read the data of that particular range
public class ReadDataInRange {
	
	private void ReadDataRange(int initialRow, int endRow) throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
		FileReader fr = new FileReader(f);  //Read File
		BufferedReader br = new BufferedReader(fr);
		String s;
		int actualRow=0;
		
		while ((s=br.readLine()) != null) {
			actualRow = actualRow+1;
			if ((actualRow>=initialRow) && (actualRow<=endRow)){
				System.out.println(s);
				break;
			}
			
		}

	}

	

	public static void main(String[] args) throws IOException {
		ReadDataInRange rd = new ReadDataInRange();
		rd.ReadDataRange(2, 4);
		

	}

}
